package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    //Method
    public void generateHashMap(){

        // Create hashmap
        HashMap<String, Double> emp = new HashMap<>();

        // put elements in the map, place value
        emp.put("Abdikadir Kedne", 6000.00);  // add objects
        emp.put("Olivia Williams", 9000.00);
        emp.put("Jacey Bowley", 7000.00);
        emp.put("John Anthony", 8000.00);

        //Get a set of the entries
        Set set = emp.entrySet();

        //Get an iterator, hass a dditional method to Loop thru
        Iterator i = set.iterator();

        while (i.hasNext()){   //used ietator to loop through

            Map.Entry me = (Map.Entry) i.next(); // Cast
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());

            System.out.println();

        }




    }
}
