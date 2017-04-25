package org.opentutorials.javatutorials.overriding.example1;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
//    public void avg() {
//        System.out.println((this.left + this.right) / 2);
//    }
    public int avg() {
        return ((this.left + this.right) / 2);
    }

}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }
     
//    public int avg() {
//        return (this.left + this.right)/2;
//    }
    public int avg() {
        return super.avg();
    }


    
    public void substract() {
        System.out.println(this.left - this.right);
    }
}


public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("��� �����" + c1.avg() + "�Դϴ�.");
        c1.substract();

	}

}
