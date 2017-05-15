package org.opentutorials.javatutorials.polymorphism;

interface I2{
    public String A();
}
interface I3{
    public String B();
}
class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}


public class PolymorphismDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      D obj = new D();
	        I2 objI2 = new D();
	        I3 objI3 = new D();
	         
	        obj.A();
	        System.out.println(obj.A());
	        obj.B();
	        System.out.println(obj.B());
	         
	        objI2.A();
	        System.out.println(objI2.A());
	        //objI2.B();
	         
	        //objI3.A();
	        objI3.B();
	        System.out.println(objI3.B());

	}

}
