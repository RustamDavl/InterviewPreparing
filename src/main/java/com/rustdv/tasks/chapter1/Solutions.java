package com.rustdv.tasks.chapter1;

import com.rustdv.searching.HashTable;

public class Solutions {

    public static void main(String[] args) {
        byte i = -4;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i >> 1);
        System.out.println(Integer.toBinaryString(i >> 1));
        System.out.println(i >>> 1);
        System.out.println(Integer.toBinaryString(i >>> 1));
    }

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

}
