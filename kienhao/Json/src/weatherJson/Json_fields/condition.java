package weatherJson.Json_fields;

public class condition {
	private int code;
	private String date;
	private double temp;
	private String text;
	
	public condition() {
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "condition [code=" + code + ", date=" + date + ", temp=" + temp + ", text=" + text + "]";
	}
	
	
	
}
