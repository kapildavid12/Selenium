
public class EX27_Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EX27_Java4 a = new EX27_Java4();  //Creating object in order to calling methods
		a.method1(); // calling method 1
		
		String s = a.method2(); //calling method2
		System.out.println(s);
		
		EX27_Java4a b = new EX27_Java4a(); //creating object of outside class in-order to call it's method
		b.method3(); //calling method3 from outside
		
		method4(); //since we used static in method4, we are calling it directly without creating Object

	}
	
	public void method1()
	{
		System.out.println("I'm from method 1");
	}
	
	public String method2()
	{
		return "I'm from method 2";
	}
	
	public static void method4()
	{
		System.out.println("I'm from method 4 and it's created using Static keyword");
	}

}
