package com.cjc.Demoblaze.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Common 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static XSSFWorkbook aw;
	public static XSSFSheet sheet;
	public static XSSFSheet sheet1;
	public static XSSFSheet sheet2;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String Username;
	public static String password;
	public static String lusername;
	public static String lpassword;
	public static String name;
	public static String country;
	public static String city;
	public static String card;
	public static String month;
	public static String year;
	
	public static FileInputStream fineCall() throws FileNotFoundException 
	{
	fis=new FileInputStream("src/test/resources/Demoblaze.xlsx")	;
	return fis;
	}
	static List<String> li=new ArrayList<String>();

	 public static void Data() throws IOException
	 {
		 fis=new FileInputStream("src/test/resources/Demoblaze.xlsx");
		  aw=new XSSFWorkbook(fis);
	   sheet=aw.getSheet("Sheet1"); 
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<rowcount+1;i++)
		{
			for(int j=0;j<2;j++)
			{
				String v=sheet.getRow(i).getCell(j).getStringCellValue();
				li.add(v);
			}
			Username=li.get(0);
			password=li.get(1);
			
		}
	 
		sheet1=aw.getSheet("Sheet2");
		int rowcount1=sheet1.getLastRowNum();
		for(int i=1;i<rowcount1+1;i++)
		{
			for(int j=0;j<2;j++)
			{
				String v=sheet1.getRow(i).getCell(j).getStringCellValue();
				li.add(v);
			}
			lusername=li.get(2);
			lpassword=li.get(3);
		
		}
		sheet2=aw.getSheet("Sheet3");
		int rowcount2=sheet2.getLastRowNum();
		for(int i=1;i<rowcount2+1;i++)
		{
			for(int j=0;j<6;j++)
			{
				String v=sheet2.getRow(i).getCell(j).getStringCellValue();
				li.add(v);
			}
			name=li.get(4);
			country=li.get(5);
		     city=li.get(6);
		     card=li.get(7);
		     month=li.get(8);
		     year=li.get(9);
		     System.out.println(name+country+city+card+month+year);
		}
//	public static String regusername() throws IOException
//	{
//	fis=new FileInputStream("src/test/resources/Demoblaze.xlsx");
//	aw=new XSSFWorkbook(fis);
//	sheet=aw.getSheet("Sheet1");
//	row=sheet.getRow(1);
//	cell=row.getCell(0);
//	String username=cell.getStringCellValue();
//	return username;
//	}
//	public static String regpassword() throws IOException
//	{
//	fis=new FileInputStream("src/test/resources/Demoblaze.xlsx");
//	aw=new XSSFWorkbook(fis);
//	sheet=aw.getSheet("Sheet1");
//	row=sheet.getRow(1);
//	cell=row.getCell(1);
//	String pass=cell.getStringCellValue();
//	return pass;
//	}
//	public static String loginusername() throws IOException
//	{
//	fis=new FileInputStream("src/test/resources/Demoblaze.xlsx");
//	aw=new XSSFWorkbook(fis);
//	sheet=aw.getSheet("Sheet2");
//	row=sheet.getRow(1);
//	cell=row.getCell(0);
//	String username=cell.getStringCellValue();
//	return username;
//	}
//	public static String loginpassword() throws IOException
//	{
//	fis=new FileInputStream("src/test/resources/Demoblaze.xlsx");
//	aw=new XSSFWorkbook(fis);
//	sheet=aw.getSheet("Sheet2");
//	row=sheet.getRow(1);
//	cell=row.getCell(1);
//	String pass=cell.getStringCellValue();
//	return pass;
//	}
		 }
}
