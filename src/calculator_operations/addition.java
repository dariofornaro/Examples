package calculator_operations;

public class addition extends Operation{

	@Override
	public String getName() {
		return "addition";
	}
	
	 @Override
	 public String getOperator() {
		 return"+";
	 }
	 
	 @Override 
	 public double calc() {
		 return a + b;
	 }
}
