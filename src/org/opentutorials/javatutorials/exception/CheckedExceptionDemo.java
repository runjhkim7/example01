package org.opentutorials.javatutorials.exception;

import java.io.*;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bReader = null;
        try {
//            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
            bReader = new BufferedReader(new FileReader("out.txt"));
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String input = null; 
//        input = bReader.readLine();
        try{
  			input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        
        System.out.println(input); 

	}

}
