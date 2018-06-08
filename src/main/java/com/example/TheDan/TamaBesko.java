package com.example.TheDan;

import java.math.BigDecimal;
import java.util.List;


public class TamaBesko {

    BigDecimal flow;
    BigDecimal releaseMechanismPosition;
    BigDecimal verticalCenterOfGravity;
    BigDecimal horizontalCenterOfGravity;
    BigDecimal hight;
    BigDecimal width;
    BigDecimal currentWaterHight;


    public TamaBesko(){

    }

    public TamaBesko(BigDecimal waterHight, BigDecimal verticalPosition, BigDecimal hight, BigDecimal releaseMechanismPosition){
        this.currentWaterHight=waterHight;
        this.verticalCenterOfGravity=verticalPosition;
        this.hight=hight;
        this.releaseMechanismPosition=releaseMechanismPosition;



    }



    //synchro ze zbiornikiem
    // policzyc calkowity przeplyw

//    BigDecimal przeplywCalkowity = upustyDenne.stream()
//        .reduce(upustyDenne + upustyPrzelewowe){
//        return upustyDenne.addAll()+
//    }
}


//    SlaContract sumContract = slaContractList.stream()
//            .reduce(new SlaContract(0, 0.0, 0.0), (sla1, sla2) -> {
//                return new SlaContract(sla1.getNumberOfCPUs() + sla2.getNumberOfCPUs(), sla1.getworkBandwith() + sla2.getworkBandwith(), sla1.getMemory() + sla2.getMemory());
//            });
//
//    PoBigDecimal sumPoBigDecimal = poBigDecimalsList.stream()
//            .reduce(new PoBigDecimal(0, 0), (p1, p2) -> {
//                return new PoBigDecimal(p1.x + p2.x, p1.y + p2.y);
//            });
