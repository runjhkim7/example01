package org.test.Filemanager;

import java.io.File;
import java.io.IOException;

public class SubFileTest {

	public static void getFileList(String path) {
		File dir = new File(path);

		File[] fileList = dir.listFiles();

		for (int i = 0; i < fileList.length; i++) {

			File file = fileList[i];

			if (file.isFile()) {
				// if(file.getName().contains("ini")) {

				// 파일이 있다면 파일 이름 출력
				System.out.println("\t 파일 이름 = " + file.getName());

			}
		}

	}

	public static void main(String[] args) {
		//String path = "c:\\";
		String path = args[0];

		System.out.println("### " + path + " result");
		// TODO Auto-generated method stub
		getFileList(path);

		path = "c:\\canon";
		System.out.println("### " + path + " result");
		// TODO Auto-generated method stub
		getFileList(path);
	}

}
