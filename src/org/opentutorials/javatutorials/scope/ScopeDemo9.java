package org.opentutorials.javatutorials.scope;

class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(this.v);
    }
}

public class ScopeDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C3 c3 = new C3();
        c3.m();
	}

}
