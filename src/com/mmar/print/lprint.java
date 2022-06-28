package com.mmar.print;
import java.io.File;
public class lprint
{
	public static String print(File[] flist){
		String s="";
		int k=0;
		for(File f:flist){
			k=k+1;
			s=s+k+"."+f.getName();
			if(k<flist.length){s=s+"\n";}
		}
		return s;
	}
	public static String print(String[] list){
		String s="";
		int k=0;
		for(String f:list){
			k=k+1;
			s=s+k+"."+f;
			if(k<list.length){
				s=s+"\n";
			}
		}
		return s;
	}
}