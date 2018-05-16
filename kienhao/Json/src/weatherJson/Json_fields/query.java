package weatherJson.Json_fields;

public class query {
	private int count;
	private String created;
	private String lang;
	private results results;
	
	public query() {
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public results getResults() {
		return results;
	}

	public void setResults(results results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "query [count=" + count + ", created=" + created + ", lang=" + lang + ", results=" + results + "]";
	}
	
	
}
