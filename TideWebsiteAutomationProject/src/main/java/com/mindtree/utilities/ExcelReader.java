package com.mindtree.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
	ArrayList<String> list = new ArrayList<String>();
	public ArrayList<String> getExcelData() throws IOException{
		FileInputStream fs = new FileInputStream("C:\\Users\\Spoorthy\\eclipse-workspace\\ecomproject\\testdata\\ExcelDriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet=null;
		int count = workbook.getNumberOfSheets();
		for(int i=0;i<count;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				sheet = workbook.getSheetAt(i);
			}
		}
		Iterator<Row> ri = sheet.iterator();
		Row firstrow = ri.next();
		Iterator<Cell> ci =firstrow.cellIterator();
		int columnidx=0;
		while(ci.hasNext()) {
			Cell value = ci.next();
			if(value.getStringCellValue().equalsIgnoreCase("testcases")) {
				columnidx = value.getColumnIndex();
			}
		}
		while(ri.hasNext()) {
			Row row = ri.next();
			if(row.getCell(columnidx).getStringCellValue().equalsIgnoreCase("signin")) {
				Iterator<Cell> celliter = row.cellIterator();
				while(celliter.hasNext()) {
					list.add(celliter.next().getStringCellValue());
				}
			}
		}
		workbook.close();
		return list;
	}
}
