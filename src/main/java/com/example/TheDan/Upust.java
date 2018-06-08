package com.example.TheDan;


import java.math.BigDecimal;

public interface Upust {

    BigDecimal getFlowValue(BigDecimal waterAbsoluteHight);
    void setReleaseMechanismPosition(BigDecimal position);
    BigDecimal getReleaseMechanismPosition();
    void setVerticalPositionOfCenterOfGravityWithRelationToDamRelativeHight(BigDecimal verticalPosition);
    BigDecimal getVerticalCenterOfGravityPostion();
    void setHorizontalPositionOfCenterOfGravityWithRelationToDamWidth(BigDecimal horizontalPosition);
    BigDecimal getHorizontalCenterOfGravityPostion();
    void setHightOfRelease(BigDecimal hight);
    BigDecimal getHightOfRelease();
    void setWidthOfRelease(BigDecimal width);
    BigDecimal getWidthOfRelease();
    BigDecimal getCurrentWaterMediumPressureAtRelease(BigDecimal position, BigDecimal verticalPosition, BigDecimal higth);

}
