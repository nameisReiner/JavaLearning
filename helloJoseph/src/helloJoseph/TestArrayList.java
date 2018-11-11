package helloJoseph;

import java.util.*; 


public class TestArrayList {

	public static void main(String[] args) {
		
		//LISTS : ArrayList & LinkedList
		//-Order is maintained
		//can contain duplicates
		//Add, remove items
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(0,1);
		list1.add(1,2);
		System.out.println("List 1: "+list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		System.out.println("List 2: "+list2);
		
		list1.addAll(1,list2);//adds list 2 at index 1
		//list1.addAll(1,list2);  adds list 2 at the end of the list
		System.out.println("new List 1: "+list1);
		//removes element from index 1
		list1.remove(1);
		System.out.println("Remove element from List 1: "+list1);
		//prints element at index 3
		System.out.println(list1.get(3));
		
		//replace 0th element with 5
		list1.set(0, 5);
		System.out.println("Final List 1: "+list1);
		/*
		 * Search and Iterate 
		 */
		 List<String> l = new ArrayList<String>(); 
		  
	        l.add("GeeksforGeeks"); 
	        l.add("Practice"); 
	        l.add("GeeksQuiz"); 
	        l.add("IDE"); 
	        l.add("Courses");
	        
	     List<String> range = new ArrayList<String>(); 
	        
	     // Return List between 2nd(including) 
	     // and 4th element(excluding) 
	     range = l.subList(2, 4); 
	  
	     System.out.println("Array list using subList: "+range);  
	     System.out.println("SETs: ");
	     //SET
	     //Can not contain Duplicates
	     //Order is not necessarily maintained
	     //items can be added or removed easily
	     Set<String> hash_Set = new HashSet<String>();
	     hash_Set.add("Geeks");
	     hash_Set.add("Geeks"); 
	     hash_Set.add("For"); 
	     hash_Set.add("Geeks"); 
	     hash_Set.add("Example"); 
	     hash_Set.add("Set"); 
	     System.out.print("Set output without the duplicates: "); 
	  
	     System.out.println(hash_Set);
	     
	  // Set demonstration using TreeSet..puts in alphabetical order 
	    System.out.print("Sorted Set after passing into TreeSet: "); 
	    Set<String> tree_Set = new TreeSet<String>(hash_Set); 
	    System.out.println(tree_Set);
	    
	    Set<Integer> a = new HashSet<Integer>(); 
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
        Set<Integer> b = new HashSet<Integer>(); 
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
  
        // To find union 
        Set<Integer> union = new HashSet<Integer>(a); 
        union.addAll(b); 
        System.out.print("Union of the two Set: "); 
        System.out.println(union); 
  
        // To find intersection 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set: "); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set: "); 
        System.out.println(difference);   
	     
	     //Queue Type
	     //It is abstract class..relies on other data types
	     //add, peek, poke methods.  queue in a shop.  people can be added, you can check the next customer or serve them and they go away
	     
	     //Map Type
	     //abstract class
	     //mathematical concept of sets..finding intersection sets, sub sets, non intersecting items
	     //it has a key value pair  2, "Fred"
	     //Each Key Must be unique
        HashMap<String, Integer> map = new HashMap<>(); 
        
        print(map); 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
          
        System.out.println("Size of map is:- " + map.size()); 
      
        print(map); 
        if (map.containsKey("vishal"))  
        { 
            Integer aa = map.get("vishal"); 
            System.out.println("value for key \"vishal\" is:- " + aa); 
        } 
        //clears the map
        map.clear(); 
        print(map); 
    } 
      
    public static void print(Map<String, Integer> map)  
    { 
        if (map.isEmpty())  
        { 
            System.out.println("map is empty"); 
        } 
          
        else
        { 
            System.out.println(map); 
        } 
    } 
        
	

}
