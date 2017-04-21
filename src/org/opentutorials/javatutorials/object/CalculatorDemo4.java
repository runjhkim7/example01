package org.opentutorials.javatutorials.object;

class Calculator{
    int left, right;
      
    /**
         * <B>History</B>
         * <ul>
         * <li>Date : 2017. 4. 21.
         * <li>Developer : j
         * <li>여기에 Method 관련 설명을 기록한다. 
         * </ul>
         * <ul>
         * <li>Date : 2017. 4. 21.
         * <li>Developer : j
         * <li>초기에 Method를 수정하는 경우 위의 ul~/ul 태그를 복사하여 아래에 붙여 넣고 수정된 내용에 대한 기록을 한다.
         * </ul>
         *  
         * @param left
         * @param right
         */
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}


public class CalculatorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
          
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();

	}


}
