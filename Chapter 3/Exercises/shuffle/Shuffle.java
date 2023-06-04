package shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public interface Shuffle {
	public default void luckySort(ArrayList<String> strings, Comparator<String> comp) {
		ArrayList<String> sortedStrings = new ArrayList<String>(strings);
		//for (String s : strings)
		//	sortedStrings.add(s);

		sortedStrings.sort(comp);
		System.out.println("The unsorted array list is:");
		strings.forEach(System.out::println);
		System.out.println("The sorted array list is:");
		sortedStrings.forEach(System.out::println);
		while (!strings.equals(sortedStrings))
			Collections.shuffle(strings);

		System.out.println("The previously unsorted list is now:");
		strings.forEach(System.out::println);
		return;
	}
}
