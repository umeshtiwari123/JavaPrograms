import java.util.Scanner;

class FrequencyOfEachCharacterBruteForce{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Enter the String: ");
		String s = scanner.nextLine();
		
		for(char ch = 'a';ch<='z'; ch ++)
		{
			int count = 0;
			for(int i =0;i<s.length(); i++)
			{
					
					if( ch == s.charAt(i))
					{
						count ++;
					}
			}
			if(count!=0)
			System.out.println(ch +" : : : :" +count);
			
		}
		
		
	}

}
