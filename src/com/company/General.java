package com.company;

public class General extends Listener {
//General is a Listener which uses the Shift Encryption algorithm
    public General() {
        decAlgo=new ShiftDecryption();
        encAlgo=new ShiftEncryption();
    }

    //decrypts the given encrypted text
    public String decrypt(String text,byte key){

        return decAlgo.decrypt(text,key);
    }
}
