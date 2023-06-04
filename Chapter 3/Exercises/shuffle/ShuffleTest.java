package shuffle;

import java.util.List;
import java.util.ArrayList;

public class ShuffleTest {
	public static void main(String[] args) {
		Shuffle shuffle = new Shuffle() {};
		String[] names = {"Peter", "Paul", "Jackson", "David"};
		ArrayList<String> strings = new ArrayList<String>(List.of(names));
		shuffle.luckySort(strings, String::compareTo);
		return;
	}
}
