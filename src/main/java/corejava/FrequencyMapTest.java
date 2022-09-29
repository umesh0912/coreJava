package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import lombok.EqualsAndHashCode;
import lombok.ToString;

public class FrequencyMapTest {

	@ToString
	@EqualsAndHashCode
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

		FrequencyMapTest m = new FrequencyMapTest();

		String str = "Item1:A|Item2:B|Item1:A|Item3:A|Item1:H|Item4:T|Item2:M|Item2:B|Item1:G|Item4:F";

		String[] arr = str.split("\\|");

		List<String> list = Arrays.asList(arr);

		List<Item> items = new ArrayList<>();

		// Split and map to Item
		list.forEach(e -> {

			String[] arrStr = e.split(":");

			items.add(new FrequencyMapTest().new Item(arrStr[0], arrStr[1]));

		});

		// Grouping by Item Name
		Map<String, List<Item>> groupByItem = items.stream().collect(Collectors.groupingBy(Item::getItemName));

		groupByItem.forEach((k, v) -> System.out.println("key --> " + k + "  value --> " + v.size()));

		// Grouping by Item Brand
		Map<String, List<Item>> groupByBrand = items.stream().collect(Collectors.groupingBy(Item::getBrand));

		groupByBrand.forEach((k, v) -> System.out.println("key --> " + k + "  value --> " + v.size()));

		System.out.println("List-->" + items.size());

	}

}
