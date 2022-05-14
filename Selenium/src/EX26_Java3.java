
public class EX26_Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Lateral
		String s = "Kapil";
		String s1= "Kapil";
		
		//String using 'new' operator
		String a = new String("Kapil David Selenium");
		String b = new String("Kapil David Selenium");
		
		String[] arr = a.split("David"); // splitting it and saving it as array
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		String arr1 = arr[1].trim(); // trim is used to remove white space and saving it in String
		System.out.println(arr1);
		
		//print each char in a String
		
		String c = new String("Hello");
		for(int i=0;i<c.length();i++)
		{
			System.out.println(c.charAt(i)); // charAt used to get the char from String
		}
		
		//print each char in a String reversely
		
		for(int i=c.length()-1;i>=0;i--)
		{
			System.out.println(c.charAt(i));
		}

	}

}
