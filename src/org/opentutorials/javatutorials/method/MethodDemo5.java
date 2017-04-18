package org.opentutorials.javatutorials.method;

public class MethodDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbering(1,5);
	}
 
	public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

}
