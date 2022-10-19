package Pack01;
import java.util.ArrayList;
import java.util.List;

public class collectionJava {
public static void main(String[] args) 

{
	List<String> LS=new ArrayList<String>();
	LS.add("varsha");
	LS.add("shubham");
	LS.add("sunny");
	LS.add("string1");
	LS.add("string2");
	LS.add("sunny");
	LS.add("varsha");
	List<String> LS2=new ArrayList<String>();
	LS2.addAll(LS);
	for(String temp:LS2) {
		System.out.println(temp);
	}
	LS2.add(2, "wwwww");
	System.out.println(LS2.get(4));
	System.out.println(LS.contains("Sunny"));
	//LS.clear();
	System.out.println(LS.isEmpty());
	System.out.println(LS.indexOf("sunny"));
	System.out.println(LS2.indexOf("sunny"));
	System.out.println(LS2.size());
	//System.out.println(LS2.remove(3));
	System.out.println(LS2.get(3));
	System.out.println(LS.lastIndexOf("varsha"));
	
	System.out.println(LS2.equals(LS));

}
}
