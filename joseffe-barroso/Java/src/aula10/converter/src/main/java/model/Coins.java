package model;

public class Coins {
	private String ask;

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	public Double show(double value) {
		Double stringParsed = Double.parseDouble(this.ask);
		return value / stringParsed;
	}
}