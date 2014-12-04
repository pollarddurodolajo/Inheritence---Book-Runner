
public class DrSeuss extends Poem
	{
	public DrSeuss()
		{
		stanza = 10;
		name = "The Lorax";
		publishingYear = 1971;
		rateIt = (RateIt) new IsGood();
		}
	
	@Override
	public void showOW()
		{
		System.out.println("Dr.Seuss has also written . . .");	
		}
	
	@Override
	public void goToLine()
		{
		System.out.println("Go to line " + 25);
		}
	@Override
	public void showNum()
	{
		System.out.println("You are on the " + stanza + "th stanza of " + name);
	}
	@Override
	public void summary()
		{
		System.out.println(name + " published in " + publishingYear + " is about . . .");
		}
	
	public void countRhymes()
	{
		System.out.println("So far we have counted " + 25 + " lines.");
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
