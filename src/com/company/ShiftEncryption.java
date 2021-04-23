package com.company;

public class ShiftEncryption implements Encryption {

    //shifts every letter right in the plain text by the key

    @Override
    public String encrypt(String plainText, byte key) {
        char[] array=plainText.toCharArray();
        char[] decArray = new char[array.length];
        int[] asciiArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            asciiArray[i]=(int) array[i];
            asciiArray[i]=asciiArray[i]-key;
            decArray[i]= (char) asciiArray[i];
        }
        String text = new String(decArray);
        return text;
    }
}
