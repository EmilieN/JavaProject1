package Calculatrice;

import java.util.Scanner;

import Calculatrice.DivisionParZero.DivByZeroException;

public class Calculatrice {
	
	public Calculatrice(int a, int b, String c) throws DivByZeroException {
		float res = 0;
		
		switch(c) {
		case "+":
			res = a + b;
			break;
		
		case "-":
			res = a - b;
			break;
		
		case "*":
			res = a * b;
			break;
			
		case "/":
			if(b > 0) {
				res = a / b;
			}
			else {
				throw new DivByZeroException("Division par zero");
			}
			break;
		}
		
		System.out.println(res);
	}
	
	public class DivByZeroException extends Exception {
		
		public DivByZeroException() {
			super();
		}
		
		public DivByZeroException(String exception) {
			super(exception);
		}
	}
	
	public static void main(String[] args) {
		//new Calculatrice(5,3,'+');
		/*if(args.length == 3) {
			new Calculatrice(new Integer(args[0]).intValue(), new Integer(args[1]).intValue(), args[2]);
			new Calculatrice(1,2,"+");
		}*/
		
		try {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			int j = sc.nextInt();
			String s = sc.next();
			sc.close();
			new Calculatrice(i, j, s);
		}
		catch (DivByZeroException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
