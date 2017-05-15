package org.opentutorials.javatutorials.exception;

class Calculator2{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
} 

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator2 c1 = new Calculator2();
        try {
	        c1.setOprands(10, 0);
	        c1.divide();
        } catch(ArithmeticException e){
        	
        }
	}

}
