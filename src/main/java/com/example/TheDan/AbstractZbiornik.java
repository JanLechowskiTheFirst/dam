package com.example.TheDan;

import java.math.BigDecimal;

public abstract class AbstractZbiornik implements Runnable{
    BigDecimal waterLevel;
    BigDecimal waterRaiseFallRatio;

        public void runTank() {
            if(waterRaiseFallRatio.compareTo(BigDecimal.ZERO)>0){
                waterLevel.add(waterRaiseFallRatio);
            }
        }
}

