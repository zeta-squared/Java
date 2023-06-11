package list;

public sealed interface StringList permits EmptyStringList, NonEmptyStringList {
	public int size();
	public void append(String string);
}
