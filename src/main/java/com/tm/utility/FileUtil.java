/**
 * 
 */
package com.tm.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Administrator
 *
 */
public class FileUtil {
  //E:\fantianmingDocument\GitHub\fanspaceshow.github.io\2018
	
	public static String getFileContent() {
		StringBuilder sBuilder = new StringBuilder();
			// 创建字符流
			try(FileReader fr= new FileReader(
					"E:\\fantianmingDocument\\GitHub\\fanspaceshow.github.io\\2018\\java-my-file-utility.md")) {
			
			// 创建一个32位的字符数组
			char[] dqzf = new char[1024];
			int returnRead = 0;
			while ((returnRead = fr.read(dqzf)) > 0) {
				//System.out.println(new String(dqzf, 0, returnRead));
				sBuilder.append(dqzf);
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
         return sBuilder.toString();
	}
}
