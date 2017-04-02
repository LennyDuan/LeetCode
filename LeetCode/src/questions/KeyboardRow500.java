package questions;

import utility.Common;

import java.util.*;

/**
 * Created by Lenny on 01/04/2017.
 */
public class KeyboardRow500 {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(isValid(words[i])) result.add(words[i]);
        }

        String[] arr = new String[result.size()];
        arr = result.toArray(arr);
        return arr;
    }

    public String[] findWordsReg(String[] words) {
        List<String> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(regValid(words[i])) result.add(words[i]);
        }

        String[] arr = new String[result.size()];
        arr = result.toArray(arr);
        return arr;
    }

    private boolean regValid(String word) {
        String patter = "[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*";
        if (word.matches(patter)) return true;
        return false;
    }

    private boolean isValid(String word) {
        String rowOne = "qwertyuiop";
        String rowTwo = "asdfghjkl";
        String rowThree = "zxcvbnm";
        word = word.toLowerCase();

        Map<Integer, String> keyboard = new HashMap<>();

        keyboard.put(1, rowOne);
        keyboard.put(2, rowTwo);
        keyboard.put(3, rowThree);


        char first = word.charAt(0);
        int find;
        if (rowOne.indexOf(first) > -1 ) {
            find = 1;
        } else if (rowTwo.indexOf(first) > -1) {
            find = 2;
        } else {
            find = 3;
        }

        String row = keyboard.get(find);

        for(char ch: word.toCharArray()) {
            if (row.indexOf(ch) < 0)
                return false;
        }
        return true;
    }
}
