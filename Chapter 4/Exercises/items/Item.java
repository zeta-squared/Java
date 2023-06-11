package items;

import java.util.Objects;

public class Item {
	private String description;
	private double price;

	public Item(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public boolean equals(Object otherObject) {
		if (!(otherObject instanceof Item)) return false;
		Item other = (Item) otherObject;
		return Objects.equals(description, other.description) && price == other.price;
	}

	public int hashCode() {
		return Objects.hash(description, price);
	}

	public static void main(String[] args) {
		Item item1 = new Item("item", 2.38);
		DiscountedItem item2 = new DiscountedItem("item", 2.38, 0.20);

		/* test symmetry */
		System.out.println("item1.equals(item2)=" + item1.equals(item2));
		System.out.println("item2.equals(item1)=" + item2.equals(item1));

		/* test transitivity */
		DiscountedItem item3 = new DiscountedItem("item", 2.38, 0.10);
		System.out.println("item3.equals(item1)=" + item3.equals(item1));
		System.out.println("item1.equals(item2)=" + item1.equals(item2));
		System.out.println("item3.equals(item2)=" + item3.equals(item2));
	}
}
