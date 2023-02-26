package com.rustdv;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int a = 'a';
        int b = '\0';
        var string = "   hell o  ";
        String[] arr = string.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(b);
        System.out.println( "Hello World!" );
    }
}
