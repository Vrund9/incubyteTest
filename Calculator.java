package incubyte;


public class Calculator {
	public static  int add(String text)
	{
		String[] value = text.split(",|\n");
		if(text.isEmpty())
		{
			return 0;
		}
		else if(value.length > 1)
		{
			return SumofNumbers(value);
		}
		return stringToInt(text);
	}
	
	
	private static int SumofNumbers(String[] value)
	{
		int sum=0;
		for(String newNumber : value)
		{
			if(stringToInt(newNumber)> 1000)
			{
				continue;
			}
			sum= sum + stringToInt(newNumber);
		}
		return sum;
	}
	
	
	private static int stringToInt(String number)
	{
		int num = Integer.parseInt(number);
		if(num < 0)
		{
			throw new IllegalArgumentException("Negative input!");
		}
		else
		{
			return num;
		}
	}
	
}
