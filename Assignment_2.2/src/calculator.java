
public class calculator {

	private String operator;
	private int result;
	private int operand;

	public calculator() {
		this.operator = "";
		this.result = 0;
		this.operand = 0;
	}

	public String getOperator() {
		return this.operator;
	}

	public int getResult() {
		return this.result;
	}

	public int getOperand() {
		return this.operand;
	}

	public void numberButtonPressed(int number) {
		this.operand = this.operand * 10 + number;
	}

	public void clear() {
		this.operator = "";
		this.result = 0;
		this.operand = 0;
	}

	public void plus() {
		this.result = this.operand;
		this.operand = 0;
		this.operator = "+";
	}

	public void minus() {
		result = operand;
		operand = 0;
		operator = "-";
	}

	public void equals() {
		this.result = this.operand;
		this.operand = 0;
		this.operator = "=";
	}

}