package org.test.Filemanager;

import java.io.File;
import java.io.IOException;

public class SubFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("c:\\"); 

        File[] fileList = dir.listFiles(); 

        for(int i = 0 ; i < fileList.length ; i++){

		    File file = fileList[i]; 

		    if(file.isFile()){
		      if(file.getName().contains("ini")) {

	   // ������ �ִٸ� ���� �̸� ���
			        System.out.println("\t ���� �̸� = " + file.getName());
	
		  	      }
		      }
		  }

		
	}

}
