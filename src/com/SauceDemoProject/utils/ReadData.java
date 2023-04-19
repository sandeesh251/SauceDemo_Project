package com.SauceDemoProject.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData 
{
	public static String getData(String filename,String key) throws IOException
	{
		String filepath =".//resources//"+filename+".properties";
		FileInputStream inputstream = new FileInputStream(filepath);
		Properties pro = new Properties();
		pro.load(inputstream);
		return pro.getProperty(key);
		
	}
}
