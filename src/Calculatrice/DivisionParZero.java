package Calculatrice;

public class DivisionParZero {
	
	public int div(int a, int b) throws DivByZeroException {
		if(b>0) {
			return a/b;
		}
		else
			throw new DivByZeroException("Division par zero");
	}
	
	public class DivByZeroException extends Exception {
		public DivByZeroException() {
			super();
		}
		
		public DivByZeroException(String exception) {
			super(exception);
		}
	}
	
	
}
