
public class PowerConsumption {
	private int fanUnitPrice;
	private int lightUnitPrice;
	private int tvUnitPrice;
	public PowerConsumption(int fanUnitPrice, int lightUnitPrice, int tvUnitPrice) {
		this.fanUnitPrice = fanUnitPrice;
		this.lightUnitPrice = lightUnitPrice;
		this.tvUnitPrice = tvUnitPrice;
	}
	
	public int CurrentLoad(int fansCount, int lightsCount, int tvCount) {
		return fansCount*fanUnitPrice + lightsCount*lightUnitPrice + tvCount*tvUnitPrice;
	}
}
