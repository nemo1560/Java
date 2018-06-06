package nemo1560.Calculator.Process;

public class Process {
	
	private double result;
	
	public Process() {
		
	}
	
	public Double Add(Double a, Double b) {
		this.result = a+b;
		return this.result;
	}
	
	public Double Sub(Double a, Double b) {
		this.result = a-b;
		return this.result;
	}
	
	public Double Mul(Double a, Double b) {
		this.result = a*b;
		return this.result;
	}
	
	public Double Div(Double a, Double b) {
		this.result = a/b;
		return this.result;
	}
	
	public Double getResult(){
		return result;
		
	}
}
