package org.opentutorials.javatutorials.polymorphism;

class A{
    public String x(){return "x";}
}
class B extends A{
    public String y(){return "y";}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      A obj = new B();
	        System.out.println(obj.x());
//	        obj.y();
	        
//	        B obj2 = new A();
	}

}
