import java.util.ArrayList;

public class EX25_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList(); // ArrayList creation
		a.add("Kapil"); //add method is used to store values
		a.add("David");
		a.add("is");
		a.add("learning");
		a.add("Selenium");
		
		String s = a.get(4); // get method used to get the value from corresponding index
		System.out.println(s);

	}

}
