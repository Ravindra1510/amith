package pack4;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collect {

	public static void main(String[] args) {
//		Stack<String> names=new Stack<>();
//		names.add("arun");
//		names.add("karthik");
//		names.add("rakshith");
		
		
		
		
//		Stack<String> names2 = new Stack<>();
//		names.add("arun");
//		names.add("karthiken");
//		names.add("rakshithb");
//		
//		names.addAll(names2);
//		for(String v:names){
//			System.out.println(v);
//		}
//		
		
//		System.out.println(names.get(2));
//		Iterator<String> it1=names.iterator();
//		while(it1.hasNext()){
//			String str=it1.next();
//			System.out.println(str);
//		}

		
		TreeSet<String> names=new TreeSet<>();
		names.add("a");
		names.add("a");
		names.add("z");
		names.add("y");
		names.add("d");
		names.add("e");
		names.add("f");
		
		Iterator<String> it1=names.iterator();
		while(it1.hasNext()){
			String v=it1.next();
			System.out.println(v);
		}
		
		TreeMap<String, String> code=new TreeMap<>();
		code.put("ind", "019");
		code.put("us", "+13");
		code.put("uk", "022");
		
		Collection<String> vals=code.keySet();
		for(String str:vals){
			System.out.println(str);
		}
		
		Collection<String> vals1=code.values();
		for(String str:vals1){
			System.err.println(str);
			
		}
		
		
		
		
		
	
		
		
		
		}
		
	}


