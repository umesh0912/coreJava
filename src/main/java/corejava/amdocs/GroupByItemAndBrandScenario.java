package corejava.amdocs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author Umesh
 * Parsing string demo
 */

/*
 * Pojo class which hold iteamName and brand information
 */
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

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", brand=" + brand + "]";
	}

}
public class GroupByItemAndBrandScenario {

	public static void main(String[] args) {
		
		//Sample string
		String str = "Item1:A|Item2:B|Item1:A|Item3:A|Item1:H|Item4:T|Item2:M|Item2:B|Item1:G|Item4:F";

		List<String> listOfStrings = Arrays.asList(str.split("\\|"));
		
		//create list of Items
		List<Item> itemList = listOfStrings.stream()
							  .map(e -> {
								 String[] itemsInfo = e.split(":");
								 return new Item(itemsInfo[0],itemsInfo[1]);
							  }).collect(Collectors.toList());
		
		//Using stream apis, grouping by itemname
		Map<String, List<Item>> groupByItem = itemList.stream()
				.collect(Collectors.groupingBy(Item::getItemName));
		
		System.out.println("Items by ItemName");
		groupByItem.forEach((k,v) -> {System.out.println("Item name--> " + k + " Items --> " +v);});
				
		//Using stream apis, grouping by brandname
		Map<String, List<Item>> groupByBrand = itemList.stream()
				.collect(Collectors.groupingBy(Item::getBrand));
		
		System.out.println("Items by Brand");
		groupByBrand.forEach((k,v) -> {System.out.println("Brand name--> " + k + " Items --> " +v);});		
		
		/*
		 * Out Put
		 * 
			Items by ItemName
			Item name--> Item1 Items --> [Item [itemName=Item1, brand=A], Item [itemName=Item1, brand=A], Item [itemName=Item1, brand=H], Item [itemName=Item1, brand=G]]
			Item name--> Item2 Items --> [Item [itemName=Item2, brand=B], Item [itemName=Item2, brand=M], Item [itemName=Item2, brand=B]]
			Item name--> Item3 Items --> [Item [itemName=Item3, brand=A]]
			Item name--> Item4 Items --> [Item [itemName=Item4, brand=T], Item [itemName=Item4, brand=F]]
			
			Items by Brand
			Brand name--> A Items --> [Item [itemName=Item1, brand=A], Item [itemName=Item1, brand=A], Item [itemName=Item3, brand=A]]
			Brand name--> B Items --> [Item [itemName=Item2, brand=B], Item [itemName=Item2, brand=B]]
			Brand name--> T Items --> [Item [itemName=Item4, brand=T]]
			Brand name--> F Items --> [Item [itemName=Item4, brand=F]]
			Brand name--> G Items --> [Item [itemName=Item1, brand=G]]
			Brand name--> H Items --> [Item [itemName=Item1, brand=H]]
			Brand name--> M Items --> [Item [itemName=Item2, brand=M]]


		 */
		
	}

}
