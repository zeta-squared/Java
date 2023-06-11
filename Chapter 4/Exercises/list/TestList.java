package list;

public class TestList {
	public static void main(String[] args) {
		NonEmptyStringList stringList = new NonEmptyStringList("string1");
		stringList.append("string2");
		stringList.append("string3");
		stringList.append("string4");
		System.out.println(stringList);
		System.out.println("The size of stringList is " + stringList.size());
	}
}
