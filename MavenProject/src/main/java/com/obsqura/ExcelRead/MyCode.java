package com.obsqura.ExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyCode {
static FileInputStream f;
static XSSFWorkbook wb;
static XSSFSheet  sh;
 public static String stringData(int row,int colm) throws IOException {
	 f=new FileInputStream("C:\\Users\\NAUFAL\\Desktop\\Book1.xlsx");
	wb=new XSSFWorkbook(f);	
	sh=wb.getSheet("Sheet1");
	Row r=sh.getRow(row);
	Cell c=r.getCell(colm);
	return c.getStringCellValue();
 }
 public static String integerData(int row,int colm) throws IOException {
	 f=new FileInputStream("C:\\Users\\NAUFAL\\Desktop\\Book1.xlsx");
		wb=new XSSFWorkbook(f);	
		sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(row);
		Cell c=r.getCell(colm);
		int a=(int) c.getNumericCellValue();
		return String.valueOf(a);
 }
}
