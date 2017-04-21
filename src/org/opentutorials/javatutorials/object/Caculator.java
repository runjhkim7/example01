package org.opentutorials.javatutorials.object;

public class Caculator {

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
      
    public int sum(){
    	return this.left+this.right;
        //System.out.println(this.left+this.right);
    }
      
    public int avg(){
    	return (this.left+this.right)/2;
        //System.out.println((this.left+this.right)/2);
    }

}
