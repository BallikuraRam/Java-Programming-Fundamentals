package com.developer;

import java.util.HashMap;
import java.util.Map;

public class Character_repeated_and_NonRepeated {
    public static void main(String[] args) {
        firstRepeatedAndNonRepeated("hello world");
    }

    public static void firstRepeatedAndNonRepeated(String str) {

        Map<Character , Integer> charFreqMap = new HashMap<>();
        char chars[] =  str.toCharArray();
        Character firstRepeatedChar = null ;
        Character firstNonRepeatedChar = null ;

        for (char c : chars)
        {
            if (charFreqMap.containsKey(c))
            {
                charFreqMap.put(c , charFreqMap.get(c) + 1);
            }else {
                charFreqMap.put(c , 1);
            }
        }
        for (char c : chars)
        {
            if (charFreqMap.get(c) > 1)
            {
                firstRepeatedChar = c ;
                break;
            } else if (charFreqMap.get(c) == 1 && firstNonRepeatedChar == null) {
                firstNonRepeatedChar = c ;
            }
        }
        System.out.println("First Repeated Character : "+(firstRepeatedChar != null ?
                                                                firstRepeatedChar.toString() :"None"));
        System.out.println("First Non Repeated Character : "+(firstNonRepeatedChar != null ? firstNonRepeatedChar.toString(): "None"));
    }
}
