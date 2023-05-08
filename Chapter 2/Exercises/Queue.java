public class Queue {
	private Node head;
	private Node tail;

	public Queue() {
	}

	public void addString(String string) {
		if (this.tail != null) {
			this.tail.next = new Node(string);
			this.tail = this.tail.next;
		} else if (this.head != null) {
			this.head.next = new Node(string);
			this.tail = this.head.next;
		} else {
			this.head = new Node(string);
		}
	}

	public void removeString() {
		if (this.head != null)
			this.head = this.head.next;
	}

	public Iterator iterator() {
		return new Iterator();
	}

	public void printString() {
		Node node = this.head;
		while(node != null) {
			System.out.print(node.string);
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue queue = new Queue();

		queue.addString("testString1");
		queue.addString("testString2");
		queue.addString("testString3");

		Queue.Iterator iterator = queue.iterator();
		System.out.println(iterator.node.string);
		while (iterator.hasNext()) {
			iterator.next();
			System.out.println(iterator.node.string);
		}
	}

	class Node {
		String string;
		Node next;

		public Node(String string) {
			this.string = string;
		}
	}

	class Iterator {
		Node node = head;

		public void next() {
			this.node = this.node.next;
		}

		public boolean hasNext() {
			if (node.next != null)
				return true;
			else
				return false;
		}
	}
}
