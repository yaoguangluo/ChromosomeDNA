package encoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

// 最近配置养疗经从我的联想电脑到我戴尔电脑上，发现gbk在新版本eclipse 没有字符集，于是写这个函数进行所有java文件替换成utf8.
// 确定一个文件夹子，循环递归便利将里面的 java文件 进行 utf8 保存，然后rename替换
// 稍后并到德塔 data swap 工程 
// 作者 罗瑶光

public class CodingSwap{
	public static void main(String[] argv) throws IOException, InterruptedException {
		String category= new String("C:/Users/yaogu/Desktop/project/开源门户/HRJ_YLJ_18111");
		String decoding= "GBK";//解码读档
		String encoding= "UTF8";//新文件编码
		String fileTail= ".java";
		String target= "Swapped";
		//String targetType= "addTail";//addTail, deleteTail
		CodingSwap codingSwap= new CodingSwap();
		codingSwap.codingSwap(category, decoding, encoding, fileTail, target, "addTail");
		Thread.sleep(1000);
		codingSwap.codingSwap(category, decoding, encoding, fileTail, target, "deleteTail");

	}

	private void codingSwap(String category, String decoding, String encoding
			, String fileTail, String target, String targetType) throws IOException
	, InterruptedException {
		File file= new File(category);
		if(file.isDirectory()) {
			doInnerSwap(file, decoding, encoding, fileTail, target, targetType);
		}
		if(targetType.contains("addTail")) {
			doCodingSwapAddTail(file, decoding, encoding, fileTail, target, targetType);
		}
		if(targetType.contains("deleteTail")) {
			doCodingSwapDeleteTail(file, decoding, decoding, fileTail, target, targetType);
		}
	}

	private void doCodingSwapDeleteTail(File file, String decoding, String encoding, String fileTail, String target,
			String targetType) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String string= file.getAbsolutePath();
		String stringPath= file.getPath();
		if(!string.contains(fileTail)) {
			return;
		}
		if(!string.contains(target)) {
			return;
		}
		//delete original file
		File nameTofile= new File(stringPath.replace(target, ""));
		if(nameTofile.exists()) {
			nameTofile.delete();
			System.out.println("deleted:"+ string);	
		}
		Thread.sleep(2);
		if(!nameTofile.exists()) {
			file.renameTo(nameTofile);
		}
		//delete target file
	}

	private void doCodingSwapAddTail(File file, String decoding, String encoding
			, String fileTail, String target, String targetType) 
					throws IOException, InterruptedException {
		String string= file.getAbsolutePath();
		System.out.println(string);	
		if(!string.contains(fileTail)) {
			return;
		}
		if(string.contains(target)) {
			return;
		}
		//read GBK
		InputStream inputStream= new FileInputStream(file);
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader
				(inputStream, decoding));  
		//save as UTF8
		OutputStream outputStream= new FileOutputStream(file.getPath()+ target);
		BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter
				(outputStream, encoding)); 
		String stringLine;
		while((stringLine= bufferedReader.readLine())!= null) {
			bufferedWriter.write(stringLine);
			bufferedWriter.write("\r\n");
			Thread.sleep(1);
		}
		bufferedWriter.close();
		bufferedReader.close();
	}

	private void doInnerSwap(File file, String decoding, String encoding
			, String fileTail, String target, String targetType)
					throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String[] fileStrings= file.list();
		for(String fileString: fileStrings) {
			File fileOfFileString= new File(file.getPath()+ "/"+ fileString);
			if(fileOfFileString.isDirectory()) {
				doInnerSwap(fileOfFileString, decoding, encoding, fileTail
						, target, targetType);
			}
			if(targetType.contains("addTail")) {
				doCodingSwapAddTail(fileOfFileString, decoding, encoding, fileTail
						, target, targetType);
			}
			if(targetType.contains("deleteTail")) {
				doCodingSwapDeleteTail(fileOfFileString, encoding, encoding, fileTail
						, target, targetType);
			}
		}
	}
}
//
