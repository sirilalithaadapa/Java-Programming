//Card.java - Siri Lalitha 

public class Card
{
	private String denom;
	private String suite;
	private String String1;
	private String String2;

	public Card(String s1)
	{
		denom = s1.substring(0, 1);
		suite = s1.substring(1);
	}

	public String getDescription()
	{
		if (denom.equalsIgnoreCase("K"))
		{
			String1 = "King";
		}
		else if (denom.equalsIgnoreCase("Q"))
		{
			String1 = "Queen";
		}
		else if (denom.equalsIgnoreCase("J"))
		{
			String1 = "Jack";
		}
		else if (denom.equals("10"))
		{
			String1 = "Ten";
		}
		else if (denom.equals("9"))
		{
			String1 = "Nine";
		}
		else if (denom.equals("8"))
		{
			String1 = "Eight";
		}
		else if (denom.equals("7"))
		{
			String1 = "Seven";
		}
		else if (denom.equals("6"))
		{
			String1 = "Six";
		}
		else if (denom.equals("5"))
		{
			String1 = "Five";
		}
		else if (denom.equals("4"))
		{
			String1 = "Four";
		}
		else if (denom.equals("3"))
		{
			String1 = "Three";
		}
		else if (denom.equals("2"))
		{
			String1 = "Two";
		}
		else if (denom.equalsIgnoreCase("A"))
		{
			String1 = "Ace";
		}


		if (suite.equalsIgnoreCase("D"))
		{
			String2 = "Diamonds";
		}
		else if (suite.equalsIgnoreCase("H"))
		{
			String2 = "Hearts";
		}
		else if (suite.equalsIgnoreCase("C"))
		{
			String2 = "Clubs";
		}
		else if (suite.equalsIgnoreCase("S"))
		{
			String2 = "Spades";
		}

		return String1 + " of " + String2;
	}
}
