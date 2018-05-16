package weatherJson.entity;

public class link_Json {
	@SuppressWarnings("unused")
	private String link;

	public String getLink() {
		return "https://query.yahooapis.com/v1/public/yql?q=select%20item.condition%20from%20weather.forecast%20where%20woeid%20%3D%201252431&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
	}

	@SuppressWarnings("unused")
	private void setLink(String link) {
		this.link = link;
	}
	
	public link_Json() {
		// TODO Auto-generated constructor stub
	}

}
