package com.qa.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSingleKeyMultipleValuesList {

    public static void main(String[] args) {

        HashMap<String, List<String>> hashMapList = new HashMap<String, List<String>>();

        List<String> listOne = new ArrayList<String>();
        listOne.add("Apple");
        listOne.add("Aeroplane");

        List<String> listTwo = new ArrayList<String>();
        listTwo.add("Bat");
        listTwo.add("Balloon");

        List<String> listThree = new ArrayList<String>();
        listThree.add("Cartoon");
        listThree.add("Captain");

        hashMapList.put("A", listOne);
        hashMapList.put("B", listTwo);
        hashMapList.put("C", listThree);

//        System.out.println(hashMapList);

        for(Map.Entry<String, List<String>> entry : hashMapList.entrySet()) {

            String key = entry.getKey();
            List<String> listValues = entry.getValue();

            System.out.println("Key is : " + key);
            System.out.println("Values are : " + listValues);

        }













    }





}
