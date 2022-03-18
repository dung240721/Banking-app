import java.util.LinkedList;
import java.util.HashMap;

import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapSortByValue {
    public static void main(String[] args){
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting: ");
        Set set = hmap.entrySet();
        Iterator interator = set.iterator();
        while (interator.hasNext()){
            Map.Entry me = (Map.Entry)interator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println((me.getValue()));
        }
        Map < Integer, String> map = sortByValue(hmap);
        System.out.println("After Sorting: ");
        Set set2 = map.entrySet();
        Iterator itertor2 = set2.iterator();
        while ((itertor2.hasNext()))
        {
            Map.Entry me2 = (Map.Entry)itertor2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue() );
        }
}





