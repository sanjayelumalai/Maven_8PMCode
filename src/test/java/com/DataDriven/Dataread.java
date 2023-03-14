package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataread {

	// Create a object for file and pass the parameter as .xlsx location
	// ScreenShot --> File ref = new File();

	// Create a object for fileinputstream and pass the parameter as file

	// Create a object for workbook along with XSSFWorkbook and pass the parameter
	// as fis

	// by using worbookrefname

	public static void particularData() throws IOException {

		File fname = new File("C:\\Users\\ELCOT\\Desktop\\Dataread5PM.xlsx");

		FileInputStream fis = new FileInputStream(fname);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		Row row = sheet.getRow(2);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();
		System.out.println("cellType :" + cellType);

		if (cellType.equals(cellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			System.out.println("stringCellValue :" + stringCellValue);

		} else if (cellType.equals(cellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();
			System.out.println("numericCellValue : " + numericCellValue);
		}

	}

	// All Data

	// Get Row

	public static void all_Data() throws IOException {

		File fname = new File("C:\\Users\\ELCOT\\Desktop\\Dataread5PM.xlsx");

		FileInputStream fis = new FileInputStream(fname);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		System.out.println("physicalNumberOfRows :" + physicalNumberOfRows);

		for (int i = 0; i <=physicalNumberOfRows-1; i++) {
			Row row = sheet.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			System.out.println("physicalNumberOfCells :" + physicalNumberOfCells);

			for (int j = 0; j <=physicalNumberOfCells-1; j++) {
				
				
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();
				
			//	System.out.println("cellType :" + cellType);
				

				if (cellType.equals(cellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();
					System.out.println("stringCellValue :" + stringCellValue);

				} else if (cellType.equals(cellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();
					System.out.println("numericCellValue : "+ numericCellValue);
				}

			}
		}

	}

	public static void main(String[] args) throws IOException {

		all_Data();

		System.out.println(" **DONE** ");

	}

}
