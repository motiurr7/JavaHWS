package Practice_Lecture10;

import lec10_02_java_methods.Calculator05;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator01 cal01 = new Calculator01();//constructor
		cal01.addition();	
		cal01.subtraction();
		cal01.multipliction();//method
		cal01.division();	
		
		Calculator02 cal02= new Calculator02();
		cal02.addition();
		cal02.subtraction();
		cal02.usCitizen();
	
		Calculator3 cal03 = new Calculator3();
		cal03.multiplication();
		cal03.division(5.356742f,4.23574f);
		cal03.division(7.78956742f,4.23574f);
		cal03.division(4.89456742f,4.23574f);
	
		
		Calculator04 cal04 = new Calculator04();
		cal04.division();
		cal04.multiplication();
		
		Calculator05 cal05 = new Calculator05();
		cal05.addition(33, 55);
		cal05.addition(12, 100);
		cal05.subtraction(3251, 9);
		cal05.subtraction(333, 11);
		cal05.multiplication(22, 4);
		cal05.division(44, 8);
		
		
		
	
		}
	}
	


