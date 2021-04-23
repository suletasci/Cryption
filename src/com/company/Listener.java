package com.company;

//listening for encrypted messages from the Encrypter class
public class Listener {

    public Decryption decAlgo;
    public Encryption encAlgo;

    public void update(String s){
        //takes an encrypted
        //message and can decrypt the encrypted message sent by the Encrypter object via the update method
        //(called on listeners).
    }
    //subclasses overrides this method.
    public String decrypt(){
        return null;
    }

}
