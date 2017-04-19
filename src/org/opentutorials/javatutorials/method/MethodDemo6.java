package org.opentutorials.javatutorials.method;

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.method<br/>
     * <B>File Name : </B>MethodDemo6<br/>
     * <B>Description</B>
     * <ul> 
     * <li> ���ڸ� ������� ǥ���ϴ� Ŭ����
     * <li> ���ڸ� �Ѱ谪���� ������� ǥ��
     * </ul>
     * 
     * @author j
     * @since 2017. 4. 19.
     */
public class MethodDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // �޼ҵ� numbering�� ������ ���� ���� result�� ����.
        String result = numbering(1, 5);
        // ���� result�� ���� ȭ�鿡 ����Ѵ�.
        System.out.println(result);

	}

	
	   /**
	     * <B>History</B>    
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : j
	     * <li>�Ѻ��ϴ�  Method ���� ������ ����Ѵ�. 
	     * </ul>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : j
	     * <li>�ʱ⿡ Method�� �����ϴ� ��� ���� ul~/ul �±׸� �����Ͽ� �Ʒ��� �ٿ� �ְ� ������ ���뿡 ���� ����� �Ѵ�.
	     * </ul>
	     *  
	     * @param init �ʱⰪ
	     * @param limit �Ѱ谪
	     * @return
	     */
	public static String numbering(int init, int limit) {
	        int i = init;
	        // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
	        String output = "";
	        while (i < limit) {
	            // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
	            output += " " + i;
	            i++;
	        }
	        // �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
	        // ��ġ�ϸ� �ȴ�.
	        return output;
	    }

}
