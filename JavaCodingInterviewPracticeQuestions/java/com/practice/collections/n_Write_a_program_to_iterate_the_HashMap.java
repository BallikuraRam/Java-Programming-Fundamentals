package com.practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class n_Write_a_program_to_iterate_the_HashMap {

    //In this example of looping HashMap in java we have used
    // java iterator instead of for each loop.
    public static void iterateHashMapUsing_keySet_and_Iterator() {
        System.out.println("2. Iterating or looping Map Using keySet() and iterator");

        // Creating a HashMap of String keys and String values
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Ram", "Sowji");
        hashMap.put("Naveen", "Vamsi");

        System.out.println("Iterating or looping map using keySet Iterator");
        Set<String> keySet = hashMap.keySet();
        Iterator iterator = keySet.iterator();

        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println("key  " + s + "  value  " + hashMap.get(s));
        }
    }

    //In this we will use foreach loop to iterate over any map in java and using KeySet of the map to get keys.
    // This will display keys and values together.
    public static void iterating_or_looping_Map_Using_keySet_and_foreach_loop() {
        System.out.println("1. Iterating or looping Map Using keySet() and foreach loop");
        // Creating a HashMap of String keys and String values
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("A", "B");
        hashMap.put("C", "D");

        System.out.println("Iterating or looping map using foreach loop");
        // Iterating or looping using keySet() method
        for (String s : hashMap.keySet()) {
            System.out.println("ket  :" + s + "  value :   " + hashMap.get(s));

        }
    }


    public static void iterating_or_Looping_Map_in_Java_using_entrySet_and_for_each_Loop() {

        System.out.println("3. Iterating or Looping Map in Java using entrySet() and for each Loop");
        // Creating a HashMap of String keys and String values
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("east", "delhi");
        hashMap.put("west", "tamila nadu");

        // Iterating or looping using entrySet() method
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("key  : " + entry.getKey() + " value  :" + entry.getValue());
        }
    }

    //In this example we have used combination of Iterator and entrySet()
    // to show all keys and values of a Java Map.
    public static void iterate_or_Loop_HashMap_in_Java_Using_entrySet_and_java_iterator() {
        System.out.println("4. Iterate or Loop HashMap in Java Using entrySet() and java iterator");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Company", "Emp");
        hashMap.put("Teacher", "Student");

        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println("Key :" + entry.getKey() + " val :" + entry.getValue());
        }
    }

    public static void main(String[] args) {

        // calling to the methods
        iterating_or_looping_Map_Using_keySet_and_foreach_loop();
        iterateHashMapUsing_keySet_and_Iterator();
        iterating_or_Looping_Map_in_Java_using_entrySet_and_for_each_Loop();
        iterate_or_Loop_HashMap_in_Java_Using_entrySet_and_java_iterator();


    }
}
