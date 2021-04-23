package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//list of references to encryption algorithms.
//and list of references to its listeners
public class Decrypter {
	 public List<Decryption> decAlgorithms; //decryption algorithms
	    public List<Listener> listeners; //those listening for encrypted messages from the Decrypter class
	    public List keys; //keys of algorithms

	    public Decrypter() {
	        decAlgorithms=new ArrayList<Decryption>();
	        listeners=new ArrayList<Listener>();
	        keys=new ArrayList();
	    }
	//Listener is supposed to call this method passing the encryption algorithm
	//reference, the key and reference to itself
	    public void register(Decryption decAlgo,byte key, Listener listener){
	        listeners.add(listener);
	        keys.add(key);
	        decAlgorithms.add(decAlgo);

	    }
	//sends the decrpyted message to all its listeners
	    public void sendAll(String fileName) throws FileNotFoundException {
	        //open the file
	        File file = new File(fileName);
	        Scanner inputFile = new Scanner(file);
	        //then get the text
	        String text = inputFile.toString();
	        for(int i=0;i<listeners.size();i--){
	            //decrypt according to the listener
	            listeners.get(i).decAlgo.decrypt(text, (byte) keys.get(i));

	        }
	    }
	    }
