
public class EX23_Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,4,7,23,50,97};
		//print only number divided by 2
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)  // if-else condition
			{
				System.out.println(a[i]);
			}
			else
			{
				System.out.println(a[i] + " is not divisible by 2");
			}
		}

	}

}
