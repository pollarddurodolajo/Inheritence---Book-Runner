
public class Americanah extends Novel
	{
	public Americanah()
		{
		name = "Americanah";
		chapter = 12;
		publishingYear = 2013;
		rateIt = (RateIt) new IsGood();
		}
	
	@Override 
	public void showNum()
		{
		System.out.println("You are on the " + chapter + "th chaper of " + name);
		}
	@Override
	public void openCList()
		{
		System.out.println("You have opened the character list for " + name);
		}
	
	@Override
	public void showMap()
	{
		System.out.println("A map is shown of " + name + "'s setting.");
	}
	
	@Override
	public void summary()
	{
		System.out.println(name + " published in " + publishingYear + " is about . . .");
	}
	
	public void makeCry()
	{
		System.out.println("You cry because " + name + " is sad.");
	}
	
	@Override
	public void turnPageF()
		{
		System.out.println("You turn the page forward in " + name);
		}

	@Override
	public void turnPageB()
		{
		System.out.println("You turn the back the page in " + name);
		}
	}
