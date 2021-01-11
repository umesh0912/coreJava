package corejava.amdocs;

import java.util.HashMap;
import java.util.Map;

/*
 * Class which stores the node in doubly linked list
 */
class Node {
	String region;
	String value;
	Node nextPointer;
	Node prevPointer;
	
	public Node(String region, String value) {
		super();
		this.region = region;
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
	
	
	
}

/*
 * cache utility class. Using doubly linked list to manage cache values
 */
class CacheUtils {
	private int capacityOfCache;
	private Map<String, Node> cacheMemory;
	private Node headPointer;
	private Node tailPointer;

	public CacheUtils(int capacityOfCache) {
		super();
		this.capacityOfCache = capacityOfCache;
		this.cacheMemory = new HashMap<>(capacityOfCache);
	}

	public Map<String, Node> getCacheMemory() {
		return cacheMemory;
	}

	public void setCacheMemory(Map<String, Node> cacheMemory) {
		this.cacheMemory = cacheMemory;
	}

	/*
	 * Get value from cache memory
	 */
	public String retriveFromCache(String region) {

		if (cacheMemory.containsKey(region)) {

			// Get Node from region
			Node node = cacheMemory.get(region);

			return node.value;
		}

		// If value is not available then return NA
		return "NA";
	}

	public void addValueInCache(String region, String value) {
		
		if (cacheMemory.containsKey(region)) {
			Node node = cacheMemory.get(region);
			node.value = value;
			moveToFront(node);
			return;
		}

		Node node = new Node(region, value);

		if (cacheMemory.size() == capacityOfCache) {
			cacheMemory.remove(tailPointer.region);
			removeNode(tailPointer);
		}

		cacheMemory.put(region, node);
		addFirst(node);
	}

	/*
	 * Move a pointer to starting position
	 */
	private void moveToFront(Node node) {
		removeNode(node);
		addFirst(node);
	}

	/*
	 * Remove node from data structure
	 */
	private void removeNode(Node node) {
		Node prevNode = node.prevPointer;
		Node nextNode = node.nextPointer;

		if (prevNode != null) {
			prevNode.nextPointer = nextNode;
		} else {
			headPointer = nextNode;
		}

		if (nextNode != null) {
			nextNode.prevPointer = prevNode;
		} else {
			tailPointer = prevNode;
		}
	}

	/*
	 * Add a pointer to first position
	 */
	private void addFirst(Node node) {
		node.nextPointer = headPointer;
		node.prevPointer = null;

		if (headPointer != null) {
			headPointer.prevPointer = node;
		}
		headPointer = node;

		if (tailPointer == null) {
			tailPointer = node;
		}
	}

}

public class ChachedMemoryMechanism {

	public static void main(String[] args) {
		
		System.out.println("Cache demo");
		
		CacheUtils cache = new CacheUtils(3);
		
		cache.addValueInCache("region1", "some value in region1"); // this will be removed  if we add another region

		cache.addValueInCache("region2", "some value in region2");
		
		cache.addValueInCache("region3", "some value in region3");
		
		System.out.println("Before adding 4th element");
		cache.getCacheMemory().forEach((k,v) -> {System.out.println("Region number--> " + k + " value --> " +v);});
		
		cache.addValueInCache("region4", "some value in region4");
		
		System.out.println("After adding 4th element");
		System.out.println("get value from region1 (will  get NA)-->" + cache.retriveFromCache("region1"));
		
		cache.getCacheMemory().forEach((k,v) -> {System.out.println("Region number--> " + k + " value --> " +v);});
		
		/*
		 *  OutPut 
		 *  
		 *  
			Cache demo
			Before adding 4th element
			Region number--> region1 value --> some value in region1
			Region number--> region2 value --> some value in region2
			Region number--> region3 value --> some value in region3
			
			After adding 4th element
			get value from region1 (will  get NA)-->NA
			
			Region number--> region4 value --> some value in region4
			Region number--> region2 value --> some value in region2
			Region number--> region3 value --> some value in region3


		 * 
		 * 
		 * 
		 */
	}

}
