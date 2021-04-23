package com.company;

public class Spy extends Listener {
//Spy is a listener which uses binary algorithms for dec/enc

    //spy constructor creates new algorithm classes
    public Spy() {
        decAlgo=new BinaryDecryption();
        encAlgo=new BinaryEncryption();
    }

    //decrypts the given encrypted text
    public String decrypt(String text,byte key){
        return decAlgo.decrypt(text,key);
    }
}
