package org.opentutorials.javatutorials.exception;

import java.io.*;

class BB{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}

//class C{
//    void run(){
//        B b = new B();
//        try {
//            b.run();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

class CC{
    void run() throws IOException, FileNotFoundException{
        BB b = new BB();
        b.run();
    }
}


public class ThrowExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	       B b = new B();
		   CC c = new CC();
	        try {
//	            b.run();
	        	c.run();
	        } catch (FileNotFoundException e) {
//	            e.printStackTrace();
	        	System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
