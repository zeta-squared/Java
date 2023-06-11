package list;

public final class NonEmptyStringList implements StringList {
	private String head;
	private StringList tail;

	public NonEmptyStringList(String string) {
		head = string;
		tail = new EmptyStringList();
	}

	public int size() {
		int size = 1;
		if (tail instanceof EmptyStringList)
			return size;

		return size += tail.size();
	}

	public void append(String string) {
		if (tail instanceof EmptyStringList) {
			tail = new NonEmptyStringList(string);
		} else {
			tail.append(string);
		}
	}

	@Override
	public String toString() {
		if (tail instanceof EmptyStringList)
			return "[" + head + "]";

		return "[" + head + ", " + tail.toString().substring(1);
	}
}
