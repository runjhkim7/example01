package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {

    public static String[] getMembers() {
        String[] members = { "ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑÀÌ¶÷" };
        return members;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String[] members = getMembers();
	      for(String s : members) {
	    	  System.out.println(s);
	      }

	}

}
