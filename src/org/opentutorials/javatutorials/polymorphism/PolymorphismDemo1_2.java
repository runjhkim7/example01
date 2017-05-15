package org.opentutorials.javatutorials.polymorphism;
class AA{
    public String x(){return "A.x";}
}
class B1 extends AA{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends AA{
    public String x(){return "B2.x";}
}


public class PolymorphismDemo1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA obj = new B1();
		AA obj2 = new B2();
		
		System.out.println(obj.x());
		System.out.println(obj2.x());

	}

}
