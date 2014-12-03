
public class BookRunner 
	{
	public static void main(String[] args) 
		{
		Book [] book = new Book [4];
		book[0] = new theIlliad();
		book[1] = new DrSeuss();
		book[2] = new Americanah();
		book[3] = new GameOfThrones();
		
		for (int i = 0; i < book.length; i++)
			{	
			book[i].turnPageF();
			book[i].turnPageB();
			book[i].summary();
			book[i].showNum();
			System.out.println();
			}
		}
	}
