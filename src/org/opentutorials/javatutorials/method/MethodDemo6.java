package org.opentutorials.javatutorials.method;

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.method<br/>
     * <B>File Name : </B>MethodDemo6<br/>
     * <B>Description</B>
     * <ul> 
     * <li> 숫자를 순서대로 표시하는 클래스
     * <li> 숫자를 한계값까지 순서대료 표시
     * </ul>
     * 
     * @author j
     * @since 2017. 4. 19.
     */
public class MethodDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering(1, 5);
        // 변수 result의 값을 화면에 출력한다.
        System.out.println(result);

	}

	
	   /**
	     * <B>History</B>    
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : j
	     * <li>넘비링하는  Method 관련 설명을 기록한다. 
	     * </ul>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : j
	     * <li>초기에 Method를 수정하는 경우 위의 ul~/ul 태그를 복사하여 아래에 붙여 넣고 수정된 내용에 대한 기록을 한다.
	     * </ul>
	     *  
	     * @param init 초기값
	     * @param limit 한계값
	     * @return
	     */
	public static String numbering(int init, int limit) {
	        int i = init;
	        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
	        String output = "";
	        while (i < limit) {
	            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
	            output += " " + i;
	            i++;
	        }
	        // 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
	        // 배치하면 된다.
	        return output;
	    }

}
