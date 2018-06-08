package com.example.TheDan;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;

import static java.lang.StrictMath.sqrt;

public abstract class AbstractUpustPrzelewowy extends AbstractUpust{

    BigDecimal flow;
    BigDecimal releaseMechanismPosition;
    BigDecimal verticalCenterOfGravity;
    BigDecimal horizontalCenterOfGravity;
    BigDecimal hight;
    BigDecimal width;
    BigDecimal currentWaterHight;
    BigDecimal waterHight;

    public AbstractUpustPrzelewowy(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractUpustPrzelewowy that = (AbstractUpustPrzelewowy) o;
        return Objects.equals(flow, that.flow) &&
                Objects.equals(releaseMechanismPosition, that.releaseMechanismPosition) &&
                Objects.equals(verticalCenterOfGravity, that.verticalCenterOfGravity) &&
                Objects.equals(horizontalCenterOfGravity, that.horizontalCenterOfGravity) &&
                Objects.equals(hight, that.hight) &&
                Objects.equals(width, that.width) &&
                Objects.equals(currentWaterHight, that.currentWaterHight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Integer.parseInt(flow.toString()),  Integer.parseInt(releaseMechanismPosition.toString()), Integer.parseInt(verticalCenterOfGravity.toString()), Integer.parseInt(horizontalCenterOfGravity.toString()),  Integer.parseInt(width.toString()),  Integer.parseInt(currentWaterHight.toString()));
    }

    public BigDecimal getCurrentWaterMediumPressureAtRelease(BigDecimal verticalCenterOfGravity, BigDecimal waterHight , BigDecimal hight, BigDecimal releaseMechanismPosition){
        if(releaseMechanismPosition.equals(null)){
            return verticalCenterOfGravity.add(waterHight);};
        BigDecimal half = new BigDecimal("0.5");
        return (verticalCenterOfGravity.subtract(half.multiply(hight).add(releaseMechanismPosition))).add(waterHight);
    }

    public BigDecimal flowAtAHightsApproximationForCalculations(AbstractUpust upust, BigDecimal waterHight, BigDecimal releaseMechanismPosition){
        BigDecimal twenty = new BigDecimal("20");
        BigDecimal waterLevelTimes20 = twenty.multiply(waterHight);
        double waterLevelTimes20Double = waterLevelTimes20.doubleValue();
        double speed = sqrt(waterLevelTimes20Double);//realy its 2*10 m/s2 so its 20
        BigDecimal speedBig = new BigDecimal(speed, MathContext.DECIMAL64);


        if(upust instanceof AbstractUpustPrzelewowy){
            if(!releaseMechanismPosition.equals(null)){
                return  speedBig.multiply(upust.hight).multiply(upust.width);
            }
        }
        return speedBig.multiply(upust.hight).multiply(upust.width.subtract(releaseMechanismPosition));


    }
    public BigDecimal getCurrentFlowRatio(AbstractUpust upust, BigDecimal waterHight, BigDecimal verticalPosition, BigDecimal hight, BigDecimal releaseMechanismPosition){
        BigDecimal waterHights = getCurrentWaterMediumPressureAtRelease(releaseMechanismPosition, verticalPosition, hight);
        return flowAtAHightsApproximationForCalculations(upust, waterHights, releaseMechanismPosition);
    }

}