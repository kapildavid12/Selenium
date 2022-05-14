
public class EX20_Java {

	public static void main(String[] args) {
		
		int a = 10;
		String s = "Kapil David";
		char c = 'k';
		double f = 0.12;
		boolean b = false;
		System.out.println(a + "is the integar I've saved");  // above are the variables
		
		int[] arr = new int[3]; // array syntax 1
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		int[] arr2 = {25, 35}; // array syntax 2
		
		for(int i=0;i<arr.length;i++) // for loop
		{
			System.out.println(arr[i]);
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
		
		String[] s1 = {"Kapil", "David"}; // Array can use in String
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
		String[] s2= {"Hey", "Hi", "Hello"};
		for(String k : s2)
		{
			System.out.println(k);
		}
		
	}

}
