package com.company;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "Hello world";

        // getBytes() method to convert string
        // into bytes[].
        byte[] Arr = input.getBytes();

        byte[] result = new byte[Arr.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < Arr.length; i++)
            result[i] = Arr[Arr.length - i - 1];

        System.out.println(new String(result));
    }
}
