public class Fruit implements ItemElement
{
	private double price;
	private int amount;
	private String name;

	public Fruit(String iname,int iamount,double iprice)
	{
		name=iname;
		price=iprice;
		amount=iamount;
	}

	public double getPrice()
	{
		return price;
	}

	public int getAmount()
	{
		return amount;
	}

	public String getName()
	{
		return this.name;
	}

	public double accept(ShoppingCartVisitor visitor) {
		return 0;
	}
}