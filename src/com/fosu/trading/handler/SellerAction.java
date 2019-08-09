package com.fosu.trading.handler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.jdbc.Null;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.accept.ServletPathExtensionContentNegotiationStrategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fosu.trading.po.Goods;
import com.fosu.trading.po.OrderTb;
import com.fosu.trading.pojo.SellerOrder;
import com.fosu.trading.serviceDao.SellGoodsService;
import com.fosu.trading.serviceDao.SellOrderService;

@Controller
public class SellerAction {
	
	@Resource
	SellGoodsService sellGoodsService;
	
	@Resource
	SellOrderService sellOrderService;
	
	
	//查找当前会话用户id所卖的所有商品
	@RequestMapping("/findGoods")
	public ModelAndView findGoodsList() {
		String sellerId="1";//session获取userId
		System.out.println(sellerId);
		ModelAndView mav=new ModelAndView("seller/goods_manage");
		try {
			List<Goods> GoodsList = new ArrayList<Goods>();
			GoodsList=sellGoodsService.findGoodsList(sellerId);
			mav.addObject("GoodsList",GoodsList);
			System.out.println("查询结果条数："+GoodsList.size());
//			for (Goods goods : GoodsList) {
//				System.out.println(goods.getGoodsId()+"  "+goods.getGoodsName()+"  "+goods.getGoodPrice()+"  "+goods.getGoodsStatus());
//			}
			mav.addObject("message","查询成功");
		} catch (Exception e) {
			mav.addObject("message","查询失败");
			e.printStackTrace();
		}
		return mav;
	}
	
	
//	判断是否为编辑修改商品，是则要获取数据
	@RequestMapping("/publicOrUpdateGoods")
	public ModelAndView publicOrUpdateGoods(Goods goods){
//		System.out.print(goods.getGoodsName());
		ModelAndView mav=new ModelAndView("/seller/PublishGoods");
		System.out.println(goods.getGoodsId());
		if (goods.getGoodsId()!=null){
			try {
				goods=sellGoodsService.findGoodsById(goods.getGoodsId().toString());
//				System.out.print(goods.getGoodsName());
				mav.addObject("message","编辑查找商品成功");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.print("编辑查找商品出错");
				mav.addObject("message","编辑查找商品出错");
			}	
		}
		mav.addObject("goods",goods);
		return mav;
	}
	
//	发布按钮触发插入还是更新商品信息
	@RequestMapping("insertOrUpdateGoods")
	public ModelAndView ChoseInsertOrUpdateGoods(Goods goods,@RequestParam MultipartFile img,HttpServletRequest request) throws Exception, IOException{
		
		if (img.getSize() > 0) {
			
            String path = request.getServletContext().getRealPath("/")+"/image/goodsImg";
            String fileName = img.getOriginalFilename();
            if (fileName.endsWith("jpg") || fileName.endsWith("png")) {
            	UUID uuid=UUID.randomUUID();
                String uuidStr = uuid.toString();
                String uuidRep=uuidStr.replaceAll("-", "");
                String newFileName=uuidRep+fileName.substring(fileName.lastIndexOf("."));
            	System.out.println("商品旧图片路径"+goods.getGoodsImg());
            	File fileDelete=new File(goods.getGoodsImg());          	
            	fileDelete.delete();
                File file = new File(path, newFileName);
                img.transferTo(file);
                System.out.println("图片删除成功否："+fileDelete.exists());
                goods.setGoodsImg("image/goodsImg/"+newFileName);
                System.out.println(goods.getGoodsImg()+" "+goods.getGoodsName());
                System.out.println("图片上传成功");
            }
		}
		ModelAndView mav=new ModelAndView("/seller/PublishGoods");
		if (goods.getGoodsId()!=null) {
			sellGoodsService.updateGoods(goods);
			
			mav.addObject("message","修改成功");
		}
		else{
			try {
				sellGoodsService.insertGoods(goods);
				mav.addObject("message","发布成功");
			} catch (Exception e) {
				mav.addObject("message","发布失败");
				e.printStackTrace();
			}
			}
		return mav;
	}
	
//	删除指定id的商品
	@RequestMapping("/deleteGoods")
	public String deleteGoods(String goodsId){
		System.out.println("删除商品"+goodsId);
		try {
			sellGoodsService.deleteGoods(goodsId);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("删除失败");
		}
		return "redirect:/findGoods.action";
	}
	
//	更新商品上下架状态
	@RequestMapping("/updateGoodsStatus")
	public String updateGoodsStatus(@RequestParam("goodsId")String goodsId,@RequestParam("goodsStatus")String goodsStatus){
		System.out.println(goodsId+"号商品的状态变为"+goodsStatus);
		try {
			sellGoodsService.updateGoodsStatus(goodsId,goodsStatus);
			System.out.println("更新状态成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("更新状态失败");
		}
		return "redirect:/findGoods.action";
	}
	
//	查找卖家用户的所有订单---新建goodOrder对象写xml
	@RequestMapping("/findSellerOrders")
	public ModelAndView findOrders(String sellerId){
		ModelAndView mav=new ModelAndView("/seller/my_order");
		try {
			sellerId="1";
			List<SellerOrder> orderList=new ArrayList<SellerOrder>();
			orderList=sellOrderService.findSellerOrderList(sellerId);
			mav.addObject("message", "查询卖家订单成功");
			mav.addObject("orderList", orderList);
			System.out.print(orderList.get(0).getGoodsName());
			return mav;
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("message", "查询卖家订单失败");
		}
		return mav;
	}
}
