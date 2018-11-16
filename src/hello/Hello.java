package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Hello {
	
	public static <T> int linearSearch(List<T> list, Predicate<T> check) {
		for(int i = 0; i < list.size(); i++) {
			if (check.test(list.get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		check<Integer> firstMatch= new check<Integer>(11);
		check<String> someMatch= new check<String>("orange");
		check<String> noMatch= new check<String>("notafruit");
		List<Integer> intList= new ArrayList<Integer>();
		intList.add(11);
		intList.add(2);
		intList.add(13);
		List<String> stringList= new ArrayList<String>();
		stringList.add("apple");
		stringList.add("orange");
		stringList.add("cherry");
		
		System.out.println(linearSearch(intList, firstMatch));
		System.out.println(linearSearch(stringList, someMatch));
		System.out.println(linearSearch(stringList, noMatch));
	}
}
