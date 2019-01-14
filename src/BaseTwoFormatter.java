
public class BaseTwoFormatter implements NumberFormatter 
{
	@Override
	public String format(int number) 
	{
		//accounting for the number being 0
		if (number == 0)
			return ""+number;
		//creates number in base 2 format, backwards
		String backwardsBinary = "";
		while (number > 0)
		{
			backwardsBinary += ""+number%2;
			number = number/2;
		}
		
		//reverses previous string in order to return number in correct order
		String formattedNum = "";
		for (int i = backwardsBinary.length()-1; i >= 0; i--)
			formattedNum+=backwardsBinary.charAt(i);
		return formattedNum;
	}

}
