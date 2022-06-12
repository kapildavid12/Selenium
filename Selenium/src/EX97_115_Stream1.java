import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.testng.annotations.Test;

public class EX97_115_Stream1 {
	
	//count number of names starts with 'M' using regular way
	//@Test
	public void Regular() 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Modric");
		names.add("Kroos");
		names.add("Marcelo");
		names.add("Mendy");
		names.add("Benzema");
		int count = 0;
		for(int i=0;i<names.size();i++)
		{
			String a = names.get(i);
			if(a.startsWith("M"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	//count number of names starts with 'M' using streams
	@Test
	public void Stream()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Modric");
		names.add("Kroos");
		names.add("Marcelo");
		names.add("Mendy");
		names.add("Militao");
		
		Long b = names.stream().filter(s->s.startsWith("M")).count(); //Convert into stream, use intermedaite op. (filter) then use terminal op. (count)
		System.out.println(b);
		
		//Use "Stream.of" instead of creating Collection/AL, we can directly stream, filter and terminate. 
		Long c = Stream.of("Modric", "Kroos", "Marcelo").filter(s->s.startsWith("K")).count();
		System.out.println(c);
		
		//Terminal op. Will execute only if intermediate op. (filter) Returns TRUE. [We are intentionally return false below]
		Long d = Stream.of("Modric","Kroos","Marcelo").filter(s->
		{
		s.startsWith("K");
		return false;
		}).count();
		System.out.println(d);
		
		//Get name with length > 6
		names.stream().filter(s->s.length()>6).forEach(s->System.out.println(s)); //Int. op action as '.length' & terminal op as forEach[syso is ter. op action]
		
		//Get first name with length > 6
		names.stream().filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s)); //use limit(1) ter. op. to grab only first name 
	}
	@Test
	public void StreamMap()
	{
		//Strings ends with "A" in CAPS (.map is used to CAPS)
		Stream.of("Benzema", "Vini", "Kroos", "Bale", "Courtois").filter(s->s.endsWith("s")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Strings start with "A"  - sort - in CAPS (.map is used to CAPS)
		Stream.of("Benzema", "Vini", "Kroos", "Bale", "Courtois").sorted().filter(s->s.startsWith("B")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merge two arrays
		Stream name1 = Stream.of("Rodrygo", "Casemiro", "Nacho");
		Stream name2 = Stream.of("Asensio", "Camavinga", "Alaba");
		Stream.concat(name1, name2).forEach(s->System.out.println(s));
		
		//Search the matching strings
		boolean k = Stream.of("Asensio", "Camavinga", "Alaba").anyMatch(s->s.equalsIgnoreCase("Alaba"));
		System.out.println(k);
	}
	@Test
	public void StreamCollect()
	{
		//using collect() - collect the List and print only the first result
		List<String> z = Stream.of("Modric", "Ronaldo", "Casemiro").filter(s->s.endsWith("o")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(z.get(0));
	}
	
}
