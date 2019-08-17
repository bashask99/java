package java_basic_programs;

public class Duplicate_charachter {

	public static void main(String[] args) 
	{
	   
		String name="shamsheer";
		int count=0;
		name=name.toLowerCase();
		
		char[] input=name.toCharArray();
		System.out.println("Duplicates are :");
		
		for (int i = 0; i < input.length; i++) 
		{
			for (int j = i+1; j < input.length; j++)
			{
				if(input[i]==input[j])
				{
					System.out.println(input[j]);
					count++;
					break;
				}
			}
		}
	}

}
