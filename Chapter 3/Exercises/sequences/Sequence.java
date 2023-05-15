package sequences;

public interface Sequence<T> {
	public boolean hasNext();
	public T next();
}
