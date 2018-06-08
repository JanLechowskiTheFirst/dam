package com.example.TheDan;

import java.math.BigDecimal;

public abstract class UpustZasowa extends AbstractUpustDenny {

    BigDecimal flow;
    BigDecimal releaseMechanismPosition;
    BigDecimal verticalCenterOfGravity;
    BigDecimal horizontalCenterOfGravity;
    BigDecimal hight;
    BigDecimal width;
    BigDecimal currentWaterHight;

    public UpustZasowa() {
    }

    public UpustZasowa(BigDecimal postion, BigDecimal verticalHight, BigDecimal hight, BigDecimal releaseMechanismPosition) {
        setHorizontalPositionOfCenterOfGravityWithRelationToDamWidth(verticalHight);
        BigDecimal waterHights = getCurrentWaterMediumPressureAtRelease(verticalHight, hight, releaseMechanismPosition);
        getCurrentFlowRatio(this, waterHights, verticalHight, hight, releaseMechanismPosition);
    }

    @Override
    public BigDecimal getFlowValue(BigDecimal waterAbsoluteHight) {
        return BigDecimal.ZERO;
    }

    @Override
    public void setReleaseMechanismPosition(BigDecimal position) {

    }

    @Override
    public BigDecimal getReleaseMechanismPosition() {
        return BigDecimal.ZERO;
    }

    @Override
    public void setVerticalPositionOfCenterOfGravityWithRelationToDamRelativeHight(BigDecimal verticalPosition) {

    }

    @Override
    public void setHorizontalPositionOfCenterOfGravityWithRelationToDamWidth(BigDecimal horizontalPosition) {

    }

    @Override
    public void setHightOfRelease(BigDecimal hight) {

    }

    @Override
    public void setWidthOfRelease(BigDecimal width) {

    }
}

