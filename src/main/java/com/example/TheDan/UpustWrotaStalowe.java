package com.example.TheDan;


import java.math.BigDecimal;

public abstract class UpustWrotaStalowe extends AbstractUpustPrzelewowy {

    BigDecimal flow;
    BigDecimal releaseMechanismPosition;
    BigDecimal verticalCenterOfGravity;
    BigDecimal horizontalCenterOfGravity;
    BigDecimal hight;
    BigDecimal width;
    BigDecimal currentWaterHight;

    public UpustWrotaStalowe(){
    }

    public UpustWrotaStalowe(BigDecimal verticalHight, BigDecimal hight, BigDecimal releaseMechanismPosition){
        setHorizontalPositionOfCenterOfGravityWithRelationToDamWidth(verticalHight);
        setReleaseMechanismPosition(releaseMechanismPosition);
        setHightOfRelease(hight);
        BigDecimal waterHights = getCurrentWaterMediumPressureAtRelease(verticalHight, hight,  releaseMechanismPosition);
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
    public BigDecimal getVerticalCenterOfGravityPostion() {
        return BigDecimal.ZERO;
    }

    @Override
    public void setHorizontalPositionOfCenterOfGravityWithRelationToDamWidth(BigDecimal horizontalPosition) {

    }

    @Override
    public BigDecimal getHorizontalCenterOfGravityPostion() {
        return BigDecimal.ZERO;
    }

    @Override
    public void setHightOfRelease(BigDecimal hight) {

    }

    @Override
    public BigDecimal getHightOfRelease() {
        return BigDecimal.ZERO;
    }

    @Override
    public void setWidthOfRelease(BigDecimal width) {

    }

    @Override
    public BigDecimal getWidthOfRelease() {
        return BigDecimal.ZERO;
    }
}

