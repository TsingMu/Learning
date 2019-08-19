package com.tsing.menu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOperate {
	private File file = null;
	public FileOperate(String pathName){
		this.file = new File(pathName);
	}
	
	public boolean save(Object obj) throws Exception{
		ObjectOutputStream oos = null;
		boolean flag = false;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(this.file));
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {
			if(oos != null){
				oos.close();
			}
		}
		return flag;
	}
	
	public Object load() throws Exception{
		Object obj = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(this.file));
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally{
			if(ois != null){
				ois.close();
			}
		}
		return obj;
	}

}
