package model;


public class Coin {
	private GenericCoin genericCoin;

	
	public GenericCoin getGenericCoin() {
		return genericCoin;
	}


	public void setGenericCoin(GenericCoin genericCoin) {
		this.genericCoin = genericCoin;
	}


	public Double showResult (double value) {
		String formattedAsk = genericCoin.getAsk().replaceAll(",", ".");
		Double coin = Double.parseDouble(formattedAsk);
		
//		return coin * value;
		return coin;
	}
}
