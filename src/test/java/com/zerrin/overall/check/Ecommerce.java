package com.zerrin.overall.check;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ecommerce {
	public static String getData(int rowNo,int cellNo) throws Throwable {
		String value=null;
		File location = new File("E:\\java\\Project\\E-commerce\\Zerrin\\test data\\excelread.xlsx");
		FileInputStream st=new FileInputStream(location);
		Workbook workbook =new XSSFWorkbook(st);
		Sheet sheet=workbook.getSheet("sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		value = cell.getStringCellValue();
		return value;
		
	}

}
