package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceIntro {

	public static void main (String[] args) throws IOException {
		
		String filPath="\\Users\\carpo\\OneDrive\\Desktop\\ITE115\\Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filPath);
		
		Workbook wbook =new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		
		Row row1=sheet.getRow(0);
		
		Cell cell=row1.getCell(1);
		
		//to get value from cell
		String r1cell2=cell.toString();
		System.out.println(r1cell2);//LastName
		
		
		//how to get New york
		Row row3=sheet.getRow(2);
		Cell r3c3=row3.getCell(2);
		String cellValue=r3c3.toString();
		System.out.println(cellValue);
		
		//acess VA
		cellValue=sheet.getRow(1).getCell(3).toString();
		System.out.println(cellValue);
		
		//to retrieve values based on type
		double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellv);
		
		//how to get 20151 in a String format
		
		String valC=sheet.getRow(1).getCell(4).toString();
		String[] arr=valC.split("\\.");
		System.out.println(arr[0]);
		
		
	}
}
