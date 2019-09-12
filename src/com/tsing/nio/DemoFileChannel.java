package com.tsing.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class DemoFileChannel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] info = {"fdffdgafdd","udaf as","c\n","sfdsaf ak"};
		File file = new File("/Users/tsingmu/Documents/test.txt");
		FileOutputStream out = null;
		out = new FileOutputStream(file);
		FileChannel fout = out.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(2014);
		for(int i = 0;i < info.length;i++) {
			buf.put(info[i].getBytes());
		}
		buf.flip();
		fout.write(buf);
		fout.close();
		out.close();
	}

}
