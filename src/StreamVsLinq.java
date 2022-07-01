import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StreamVsLinq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using same data structures as the linq in C# to test syntax
				
				//Have to use array list
				List<String> words = new ArrayList<String>();
				
				//Hashmap not dictionary
				HashMap<String,String> hashMap =   new HashMap<String,String>() ;
				
				//Exact same
				int[] testNum = { 50, 1, -1, 66, -80, 1000, 682, -972, 0, 30, 20, 66, 94, 28 };
				
				
				//lower case a
				words.add("hello");
				words.add("test");
				words.add("goodbye");
				words.add("tree");
				words.add("map");
				words.add("stack");
				words.add("queue");
				
				//Put instead of add
				hashMap.put("hello", "greeating");
				hashMap.put("goodbye", "parting");
				hashMap.put("book", "novel");
				hashMap.put("motherboard", "links the entire computer");
				hashMap.put("hard drive", "stores operating system and files");
				hashMap.put("cpu", "processor");
				hashMap.put("ram", "memory");
				hashMap.put("psu", "power supply unit");
				hashMap.put("gpu", "graphical processing unit");
				hashMap.put("cpu fan", "cools cpu");
				hashMap.put("wifi card", "pci express card for wifi connections");
	}

}
