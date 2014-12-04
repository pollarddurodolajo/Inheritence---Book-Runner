
public abstract class Book 
	{
	protected String name;
	protected int publishingYear;
	protected RateIt rateIt;
	
	public abstract void summary();
	public abstract void turnPageF();
	public abstract void turnPageB();
	public abstract void showNum();
	
	public void bookInfo()
		{
		System.out.println(name + " was published in " + publishingYear);
		}
	}
