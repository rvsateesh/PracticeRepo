
public class Bouquet {
	private int rosePrice;
	private int jasminePrice;
	private int lilyPrice;
	public Bouquet(int rosePrice, int jasminePrice, int lilyPrice) {
		this.rosePrice = rosePrice;
		this.jasminePrice = jasminePrice;
		this.lilyPrice = lilyPrice;
	}
	public int BouquetPrice(int roseCount, int jasmineCount, int lilyCount) {
		return roseCount*rosePrice + jasmineCount*jasminePrice + lilyCount*lilyPrice; 
	}
	
}
