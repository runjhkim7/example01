package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator {
    int left, right;
    
    public Calculator(){}
    
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
 
	public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
 
	
	public SubstractionableCalculator(int left, int right) {
    	super(left, right);
    	// 하위 초기화는 Super 초기화 후 진행
//        this.left = left;
//        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
