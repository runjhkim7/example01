package org.opentutorials.javatutorials.constant2;
class Fruit3{
    public static final Fruit3 APPLE  = new Fruit3();
    public static final Fruit3 PEACH  = new Fruit3();
    public static final Fruit3 BANANA = new Fruit3();
}

class Company3{
    public static final Company3 GOOGLE = new Company3();
    public static final Company3 APPLE = new Company3();
    public static final Company3 ORACLE = new Company3();
}


public class ConstantDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if (Fruit3.APPLE.equals(Company3.APPLE)) {
		if (Fruit3.APPLE.toString() == Company3.APPLE.toString()) {
			System.out.println("과일 애플과 회사 애플이 같다.");
		}

	}

}
