package com.cisdi.base.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文件工具
 * @author dongs
 *
 * 2016年9月28日 下午5:33:09
 */
public class FileUtil {

	/**
	 * 将文件转成byte[]
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static byte[] getFileByte(File file) throws IOException {
		byte[] buffer = null;
		if (file.isFile()) {
			buffer = new byte[(int) file.length()];
			FileInputStream fi = new FileInputStream(file);
			int offset = 0;
			int numRead = 0;
			while (offset < buffer.length
					&& (numRead = fi.read(buffer, offset, buffer.length
							- offset)) >= 0) {
				offset += numRead;
			}
			// 确保所有数据均被读取
			if (offset != buffer.length) {
				fi.close();
				throw new IOException("Could not completely read file "
						+ file.getName());
			}
			fi.close();
		}
		return buffer;
	}

	/**
	 * 根据byte数组，生成文件
	 */
	public static File getFile(byte[] bfile, String filePath, String fileName) {
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		File file = null;
		try {
			File dir = new File(filePath);
			if (!dir.isDirectory()) {// 判断文件目录是否存在
				dir.mkdirs();
			}
			file = new File(filePath + "\\" + fileName);
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			bos.write(bfile);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		return file;
	}

	/**
	 * 获取文件内容
	 * 
	 * @param file
	 * @return
	 */
	public static String getFileString(File file) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if(br == null) {
			return null;
		}
		String line = "";
		StringBuffer buffer = new StringBuffer();
		try {
			while ((line = br.readLine()) != null) {
				buffer.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return buffer.toString();
	}

	/**
	 * 将字符串写入文件
	 * 
	 * @param content
	 * @param file
	 */
	public static void writeFile(String str, File file) {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			file.delete();
		}
		byte bytes[] = new byte[512];
		bytes = str.getBytes(); // 新加的
		int b = str.length(); // 改
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write(bytes, 0, b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}