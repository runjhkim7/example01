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

				// ������ �ִٸ� ���� �̸� ���
				System.out.println("\t ���� �̸� = " + file.getName());

			}
		}

	}

	public static void main(String[] args) {
		String path = "c:\\";
		System.out.println("### " + path + " result");
		// TODO Auto-generated method stub
		getFileList(path);

		path = "c:\\canon";
		System.out.println("### " + path + " result");
		// TODO Auto-generated method stub
		getFileList(path);
	}

}
