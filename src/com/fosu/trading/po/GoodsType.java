package com.fosu.trading.po;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class GoodsType {
    private BigDecimal typeId;

    private String typeName;

    private BigDecimal typeParent;

    public BigDecimal getTypeId() {
        return typeId;
    }

    public void setTypeId(BigDecimal typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public BigDecimal getTypeParent() {
        return typeParent;
    }

    public void setTypeParent(BigDecimal typeParent) {
        this.typeParent = typeParent;
    }
}