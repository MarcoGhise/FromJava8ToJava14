package it.blog.java.version.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		/*
		 * Collections
		 */
		List<String> list = List.of("one", "two", "three");
		Set<String> set = Set.of("one", "two", "three");
		Map<String, String> map = Map.of("foo", "one", "bar", "two");

		System.out.println(list);
		System.out.println(set);
		System.out.println(map);

		String k1 = "key1";
		String v1 = "value1";

		String k2 = "key2";
		String v2 = "value2";

		Map.ofEntries(Map.entry(k1, v1), Map.entry(k2, v2));
	}
}
