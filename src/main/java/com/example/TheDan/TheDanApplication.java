package com.example.TheDan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;

import static com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal;


@SpringBootApplication
public class TheDanApplication {

	public static void main(String[] args) {



		BigDecimal releaseMechanismPosition = BigDecimal.ZERO;
		BigDecimal verticalCenterOfGravity =  BigDecimal.ZERO;
		BigDecimal hight =  BigDecimal.ZERO;
		BigDecimal waterLevel = BigDecimal.ZERO;
		BigDecimal waterRaiseFallRatio =  BigDecimal.ZERO;


		SpringApplication.run(TheDanApplication.class, args);
		for(int conter = 0; conter < args.length; conter++){
			if (!args[0].equals(null)) {
				verticalCenterOfGravity = parseBigDecimal(args[0]);
			}
			if (!args[1].equals(null)) {
				releaseMechanismPosition = parseBigDecimal(args[1]);
			}
			if (!args[2].equals(null)) {
				hight = parseBigDecimal(args[2]);
			}
			if (!args[3].equals(null)) {
				waterLevel = parseBigDecimal(args[3]);
			}
			if (!args[4].equals(null)) {
				waterRaiseFallRatio = parseBigDecimal(args[4]);
			}
		}


		TamaBesko tama = new TamaBesko(waterLevel, verticalCenterOfGravity, hight, releaseMechanismPosition);
		(new Thread(new ZbiornikBesko(waterLevel, waterRaiseFallRatio))).start();

	}

}
