package java_basic_programs;

public class Convert_char_to_String {

	public static void main(String[] args) 
	{
		//method1 by using toString()
		char ch='a';
		String str=Character.toString(ch);
		System.out.println("String is  " +str);
		
		//method2 by using valueof();
		String str2=String.valueOf(ch);
		System.out.println("String is "+ str2);
	}

}
