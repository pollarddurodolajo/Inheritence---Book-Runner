
public class theIlliad extends Poem
{
	public theIlliad()
	{
	stanza = 34;
	name = "The Illiad";
	publishingYear = 762;
	}

@Override
public void showOW()
	{
	System.out.println("Homer has also written . . .");	
	}

@Override
public void goToLine()
	{
	System.out.println("Go to line " + 898);
	}
@Override
public void showNum()
{
	System.out.println("You are on the " + stanza + "th stanza of " + name);
}
@Override
public void summary()
	{
	System.out.println("The " + name + " published in " + publishingYear + " is about . . .");
	}

public void daysSinceLeft()
	{
	System.out.println("It has been one year since Odysseus has been home.");
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
