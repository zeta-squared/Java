import java.util.ArrayList;

public class Invoice {
	private ArrayList<Item> items = new ArrayList<>();

	public static class Item {
		private String description;
		private int quantity;
		private double unitPrice;

		public Item(String description, int quantity, double unitPrice) {
			this.description = description;
			this.quantity = quantity;
			this.unitPrice = unitPrice;
		}

		public double price() {
			return (double) quantity * unitPrice;
		}

		public String getDescription() {
			return description;
		}

		public int getQuantity() {
			return quantity;
		}

		public double getUnitPrice() {
			return unitPrice;
		}
	}

	public void add(Item item) {
		items.add(item);
	}

	public void remove(Item item) {
		items.remove(item);
	}

	public double totalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < items.size(); i++) {
			totalPrice += items.get(i).price();
		}
		return totalPrice;
	}

	public void printInvoice() {
		String divider = "=";
		String spacer = " ";
		spacer = spacer.repeat(8);
		divider = divider.repeat(80);
		System.out.printf("Description%1$s%1$s%1$sQuantity%1$sUnit Price%1$sTotal Price\n",
				spacer);
		for (int i = 0; i < items.size(); i++) {
			System.out.printf("%-34s %-8d%s$%-9.2f%3$s$%-9.2f\n",
					items.get(i).getDescription(), items.get(i).getQuantity(),
					spacer, items.get(i).getUnitPrice(), items.get(i).price());
		}
		System.out.println(divider);
		System.out.printf("Total%1$s%1$s%1$s%1$s%1$s%1$s%1$s%1$s$%2$.2f\n",
				spacer, totalPrice());
	}

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		Invoice.Item radiator = new Invoice.Item("Car radiator", 3, 199.95);
		Invoice.Item tyre = new Invoice.Item("Car tyre", 4, 69.95);
		Invoice.Item coolant = new Invoice.Item("Radiator coolant (pre-mixed)",
				1, 50);
		invoice.add(radiator);
		invoice.add(tyre);
		invoice.add(coolant);
		invoice.printInvoice();
	}
}
