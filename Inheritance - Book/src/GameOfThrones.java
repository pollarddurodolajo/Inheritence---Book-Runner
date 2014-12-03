
public class GameOfThrones extends Novel
{
	public GameOfThrones()
	{
	name = "Game Of Thrones";
	chapter = 34;
	publishingYear = 1996;
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

public void showDCount()
	{
	System.out.println("The death count is currently at 3");
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
