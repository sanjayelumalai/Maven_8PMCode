package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {

	public static void Data_Write1() throws IOException {

		File fname = new File("C:\\Users\\ELCOT\\Desktop\\Dataread5PM.xlsx");

		FileInputStream fis = new FileInputStream(fname);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet createSheet = wb.createSheet("DataWrite1");

		Row createRow = createSheet.createRow(0);

		Cell createCell = createRow.createCell(0);

		createCell.setCellValue("Steve@1234");

		FileOutputStream fos = new FileOutputStream(fname);
		wb.write(fos);
		
		System.out.println("**DATA WRITE DONE**");

	}
	
	public static void main(String[] args) throws IOException {
		
		Data_Write1();
	}

}
