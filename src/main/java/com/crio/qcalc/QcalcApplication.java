package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);

		System.out.println("Starting Qcalc.....");
		StandardCalculator calc = new StandardCalculator();
		//calc.add(Double.MAX_VALUE,2);
		
		calc.divide(0, 3);
		calc.add(Double.MAX_VALUE, 1.0);
		calc.multiply(Double.MAX_VALUE, 2);
		System.out.println(calc.getResult());

		
		// LogicCalculator calc = new LogicCalculator();
		// calc.AND(8, 6);
		// calc.printResult();

		// calc.OR(8, 6);
		// calc.printResult();

		// calc.XOR(8, 6);
		// calc.printResult();

		

}
}