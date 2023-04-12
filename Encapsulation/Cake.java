import java.util.ArrayList;

public class Cake
{
	private ArrayList<Candle> candles;


	public Cake(Candle c1, Candle c2, Candle c3)
	{
		this.candles = new ArrayList<Candle>();
		this.candles.add(c1);
		this.candles.add(c2);
		this.candles.add(c3);
	}


}