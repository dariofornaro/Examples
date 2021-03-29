package calculator_operations;

public class subtraction {
	public class multiplication extends Operation {
		@Override
		public String getName() {
			return "subtraction";
		}
		
		 @Override
		 public String getOperator() {
			 return"-";
		 }
		 
		 @Override 
		 public double calc() {
			 return a - b;
		 }
	}

}
