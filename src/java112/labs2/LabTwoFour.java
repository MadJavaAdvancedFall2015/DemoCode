package java112.labs2;
import java.util.*;
import java.io.*;
public class LabTwoFour {

    Map<String, Integer> myMap;
    Map<String, Integer> mySortedMap;

public static void main(String[] args) {

LabTwoFour myProgram = new LabTwoFour();

myProgram.run();
}

public void run() {
myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("Four", 4);
        myMap.put("Five", 5);
        myMap.put("Six", 6);

        mySortedMap = new TreeMap<>(myMap);

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " = " + value);
        }

        for (Map.Entry<String, Integer> sortedEntry : mySortedMap.entrySet()) {
            String sortedKey = sortedEntry.getKey();
            Integer sortedValue = sortedEntry.getValue();

            System.out.println("TreeMap " + sortedKey + " = " + "TreeMap " + sortedValue);

       }
if (myMap.containsKey("Three")) {
                System.out.println("The value of the key Three is: " +
                    myMap.get("Three"));
        } else {
            System.out.println("There is no Three, please try again.");

}
}

}
