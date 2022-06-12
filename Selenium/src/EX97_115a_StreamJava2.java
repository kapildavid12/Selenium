import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.testng.annotations.Test;

public class EX97_115a_StreamJava2 {
	
	@Test
	public void stream()
	{
		//Get the distinct value
		List<Integer> al = Arrays.asList(4,2,1,2,7,3,9,1,4);
		al.stream().distinct().forEach(s->System.out.println(s));
		
		//Sort and get the 3 value from the AL
		
		List<Integer> i = al.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(i.get(2));
	}

}
