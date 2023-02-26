package com.rustdv.tasks.chapter1;

import com.rustdv.searching.HashTable;

public class Solutions {


    public boolean areUniqCharacters(String str) {
        char[] el = str.toCharArray();
        var ht = new HashTable<Character>();
        for(Character c : el) {
            ht.insert(c);
            if(ht.getListByKey(c).size() > 1)
                return false;
        }
        return true;
    }

    public boolean areUniqCharacters2(String str) {
        boolean[] arr = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if(arr[index])
                return false;
            arr[index] = true;
        }
        return true;
    }

    public boolean arePermutations(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        HashTable<Character> ht = new HashTable<>();
        for(int i = 0; i < str1.length(); i++) {
            ht.insert(str1.charAt(i));
            ht.insert(str2.charAt(i));
        }

        for(int i = 0; i < str1.length(); i++) {
            if(ht.getListSizeByKey(str1.charAt(i)) % 2 != 0)
                return false;
        }

        return true;
    }

    public boolean arePermutations2(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        int[] res = new int[128];
        for(int i = 0; i < str1.length(); i++) {
            res[Math.abs(str1.charAt(i) - 'a')]++;
            res[Math.abs(str2.charAt(i) - 'a')]++;
        }
        for(int i = 0; i < str1.length(); i++) {
            if(res[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }


    public void replaceSpaceWith(String changed, String to) {

    }
}
