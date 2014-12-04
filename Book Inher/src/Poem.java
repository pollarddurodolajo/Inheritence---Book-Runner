
public abstract class Poem extends Book
	{
	protected int stanza;
	
	public abstract void showOW();
	public abstract void goToLine();

	@Override
	public void turnPageF()
		{
		System.out.println("You turn forward the page of the poem!");
		}
	
	@Override
	public void turnPageB()
		{
		System.out.println("You turn back the page of the poem");
		}
	}