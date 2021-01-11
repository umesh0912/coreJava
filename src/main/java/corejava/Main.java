package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	final int num = 12;

	public void display() {

		int num = 20;

		Runnable r = new Runnable() {

			int num = 15;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(this.num);
			}
		};

		r.run();

	}

	class Item {
		String itemName;
		String brand;

		public Item(String item, String brand) {
			super();
			this.itemName = item;
			this.brand = brand;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();

		m.display();

		String str = "Item1:A|Item2:B|Item1:A|Item3:A|Item1:H|Item4:T|Item2:M|Item2:B|Item1:G|Item4:F";

		String[] arr = str.split("\\|");

		for (String str1 : arr) {
			System.out.println("list--> " + str1);
		}

		List<String> list = Arrays.asList(arr);

		// List<Items> itemName = list.stream()

		List<Item> items = new ArrayList<>();

		list.forEach(e -> {

			String[] arrStr = e.split(":");

			items.add(new Main().new Item(arrStr[0], arrStr[1]));

		});

		Map<String, List<Item>> groupByItem = items.stream()
											.collect(Collectors.groupingBy(Item::getItemName));
		
		Map<String, List<Item>> groupByBrand = items.stream()
				.collect(Collectors.groupingBy(Item::getBrand));

		System.out.println("List-->" + items.size());

	}

}
