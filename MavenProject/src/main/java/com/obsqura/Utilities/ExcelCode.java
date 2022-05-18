package com.obsqura.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
static FileInputStream f;
static XSSFWorkbook wb;
static XSSFSheet  sh;
 public  String ReadStringData(int row,int colm) throws IOException {
	 f=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Excel\\Book1.xlsx");
	wb=new XSSFWorkbook(f);	
	sh=wb.getSheet("Sheet1");
	Row r=sh.getRow(row);
	Cell c=r.getCell(colm);
	return c.getStringCellValue();
 }
 public  String ReadintegerData(int row,int colm) throws IOException {
	 f=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\Excel\\Book1.xlsx");
		wb=new XSSFWorkbook(f);	
		sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(row);
		Cell c=r.getCell(colm);
		int a=(int) c.getNumericCellValue();
		return String.valueOf(a);
 }
}
