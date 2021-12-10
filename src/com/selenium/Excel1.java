package com.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis=new FileInputStream("E:\\eclipse programs\\Automation_project\\Data\\Switi.xlsx");
	//create workbook
	Workbook wb=WorkbookFactory.create(fis);
	//get the sheet
	Sheet sh=wb.getSheet("Sheet1");
	//get the Row
	Row r=sh.getRow(0);
	//get cell
	Cell c0=r.getCell(0);
	Cell c1=r.getCell(0);
	String data0=c0.getStringCellValue();
	String data1=c0.getStringCellValue();
	System.out.println(data0+" - "+data1);
	
	
}
}

