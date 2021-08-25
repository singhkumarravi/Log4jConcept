package com.app.log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		int i=0;
		String path="E:\\lib";
		File file=new File(path);
	    String[] list = file.list();
	    File[] listFiles = file.listFiles();
	    for(File a:listFiles)
	    {
	    	System.out.println(a.getName() + "....... " + a.toString().replace("E:\\lib\\", ""));
	    }
	    System.out.println("***************************");
	    for(String s:list)
	    {
	    	System.out.println(i++ +"..."+ s);
	    }

		List<Integer> l=new ArrayList<Integer>();
		              l.add(10);
		              l.add(20);
		              l.add(30);
		              l.add(40);
		              l.add(50);
		
	 List<Integer> l2=new ArrayList<Integer>();
		             l2.add(10);
		             l2.add(50);
		             l2.add(70);
		             l2.add(80);
		             l2.add(20);
	   List<Integer> dup=new ArrayList<Integer>();
	   List<Integer> unq=new ArrayList<Integer>();
		for (Integer item : l2) {
		    if (l.contains(item)) {
		        dup.add(item);
		    } else {
		        unq.add(item);
		    }
		}
		dup.forEach(System.out::println);
		System.out.println("**********");
		unq.forEach(System.out::println);
		
	/*
	 for(Integer i:dup)
	 {
		 System.out.println("duplicate : " + i);
	 }
	 for(Integer j:unq) {
		 System.out.println("unq::" + j);
	 }
	 */
		
	}

}
