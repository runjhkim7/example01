package org.opentutorials.javatutorials.object;

public class Caculator {

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
      
    public int sum(){
    	return this.left+this.right;
        //System.out.println(this.left+this.right);
    }
      
    public int avg(){
    	return (this.left+this.right)/2;
        //System.out.println((this.left+this.right)/2);
    }

}
