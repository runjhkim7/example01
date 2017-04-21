package org.opentutorials.javatutorials.object;

class Calculator{
    int left, right;
      
    /**
         * <B>History</B>
         * <ul>
         * <li>Date : 2017. 4. 21.
         * <li>Developer : j
         * <li>���⿡ Method ���� ������ ����Ѵ�. 
         * </ul>
         * <ul>
         * <li>Date : 2017. 4. 21.
         * <li>Developer : j
         * <li>�ʱ⿡ Method�� �����ϴ� ��� ���� ul~/ul �±׸� �����Ͽ� �Ʒ��� �ٿ� �ְ� ������ ���뿡 ���� ����� �Ѵ�.
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
