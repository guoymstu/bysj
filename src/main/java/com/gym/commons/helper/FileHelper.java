package com.gym.commons.helper;

import java.io.File;

public class FileHelper {
	public static File hasNotFileMake(String filepath) {
		boolean b = false;
		File file = new File(filepath);
		if (!file.exists()) {// 判断文件目录的存在
			b = file.mkdirs();
		}
	//	System.out.println("************" + b);
		return file;
	}

}
