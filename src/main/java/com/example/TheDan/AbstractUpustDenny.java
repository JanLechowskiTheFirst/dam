package com.example.TheDan;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.StrictMath.sqrt;


public abstract class AbstractUpustDenny extends AbstractUpust {

    BigDecimal flow;
    BigDecimal releaseMechanismPosition;
    BigDecimal verticalCenterOfGravity;
    BigDecimal horizontalCenterOfGravity;
    BigDecimal hight;
    BigDecimal width;
    BigDecimal currentWaterHight;
    BigDecimal waterHight;

    AbstractUpustDenny() {
    }


    public BigDecimal getCurrentWaterMediumPressureAtRelease(BigDecimal verticalCenterOfGravity, BigDecimal waterHight, BigDecimal hight, BigDecimal releaseMechanismPosition){
       if(!releaseMechanismPosition.equals(null)){
            return verticalCenterOfGravity.add(waterHight);
    }
        BigDecimal half = new BigDecimal("0.5");
        return (verticalCenterOfGravity.subtract(half.multiply(hight))).add(waterHight);

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
        return speedBig.multiply(upust.hight).multiply(upust.width);


    }
    public BigDecimal getCurrentFlowRatio(AbstractUpust upust, BigDecimal verticalPosition, BigDecimal hight, BigDecimal releaseMechanismPosition){
        BigDecimal waterHights = getCurrentWaterMediumPressureAtRelease(releaseMechanismPosition, verticalPosition, hight);
        return flowAtAHightsApproximationForCalculations(upust, waterHights, releaseMechanismPosition);
    }

}
