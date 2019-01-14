
public class DefaultFormatter implements NumberFormatter 
{
	@Override
	/**
	 * 
	 * 
	 */
	public String format(int number) 
	{
		//creates string version of number with commas, formatted backwards
		String numString = ""+number;
		String backwardsNum = "";
		int places = 0;
		for (int i = numString.length()-1; i >= 0; i--)
		{ 
			places++;
			backwardsNum += numString.charAt(i);
			if (places%3==0 && i>0)
				backwardsNum+=",";
		}
		
		//reverses the string version of the number
		String formattedNum = "";
		for (int i = numString.length()-1; i >= 0; i--)
			formattedNum+=backwardsNum.charAt(i);
		return formattedNum;
		
	}

}
