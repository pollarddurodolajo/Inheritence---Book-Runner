
public abstract class Novel extends Book
	{
	protected int chapter = 21;
	
	public abstract void openCList();
	public abstract void showMap();
	
	@Override
	public void turnPageF()
		{
		System.out.println("You turn the page of the novel forwards!");
		}
	
	@Override 
	public void turnPageB()
	{
		System.out.println("You turn the page of the novel backwards!");
	}
	}
