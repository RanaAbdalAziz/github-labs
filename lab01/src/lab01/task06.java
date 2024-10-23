package lab01;

import java.util.*;
//------------arry----------------
/*
public class task06 {

	    public static void main(String[] args) {
	        int[] arr = {10, 20, 5, 50, 30};

	        // Sort the array
	        Arrays.sort(arr);

	        // Find the minimum and maximum
	        int min = arr[0];
	        int max = arr[arr.length - 1];

	        System.out.println("Array Minimum: " + min);
	        System.out.println("Array Maximum: " + max);
	    }

}
*/
//--------------arrylist---------------------


public class task06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(50);
        list.add(30);

        // Use Collections to find min and max
        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("ArrayList Minimum: " + min);
        System.out.println("ArrayList Maximum: " + max);
    }
}


//------------------linklist-----------------

/*
public class task06 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(50);
        list.add(30);

        // Use Collections to find min and max
        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("LinkedList Minimum: " + min);
        System.out.println("LinkedList Maximum: " + max);
    }
}
*/
//--------------------hashmap-------------------

/*
public class task06 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 5);
        map.put("d", 50);
        map.put("e", 30);

        // Find minimum and maximum values
        int min = Collections.min(map.values());
        int max = Collections.max(map.values());

        System.out.println("HashMap Minimum (Values): " + min);
        System.out.println("HashMap Maximum (Values): " + max);
    }
}
*/
//-----------------------hashset------------------------


/*public class task06 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(50);
        set.add(30);

        // Use Collections to find min and max
        int min = Collections.min(set);
        int max = Collections.max(set);

        System.out.println("HashSet Minimum: " + min);
        System.out.println("HashSet Maximum: " + max);
    }
}
*/








