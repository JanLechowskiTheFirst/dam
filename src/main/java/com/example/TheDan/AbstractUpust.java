package com.example.TheDan;

import java.math.BigDecimal;

public abstract class  AbstractUpust implements Upust {

    BigDecimal flow;
    BigDecimal releaseMechanismPosition;
    BigDecimal verticalCenterOfGravity;
    BigDecimal horizontalCenterOfGravity;
    BigDecimal hight;
    BigDecimal width;
    BigDecimal currentWaterHight;

    public AbstractUpust(){
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public BigDecimal getCurrentWaterMediumPressureAtRelease(BigDecimal position, BigDecimal verticalPosition, BigDecimal higth) {
        return BigDecimal.ZERO;
    }
}
