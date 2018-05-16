package weatherJson.Json_fields;

public class item {
	private condition condition;

	public condition getCondition() {
		return condition;
	}

	public void setCondition(condition condition) {
		this.condition = condition;
	}
	
	public item() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "item [condition=" + condition + "]";
	}
	
	
}
