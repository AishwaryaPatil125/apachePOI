package com.xworkz.ExcelProject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class ReadExcel {
private static final String NAME="C:\\Users\\lenovo\\eclipse-workspace\\ApachePOI\\src\\com\\xworkz\\excelsheetapp\\datafiles\\demo.xlsx";

public static void main(String[] args) {
	try {
	FileInputStream file=new FileInputStream(new File(NAME));
	Workbook workbook=new XSSFWorkbook(file);
	DataFormatter dataformatter=new DataFormatter();
	Iterator<Sheet> sheets=workbook.sheetIterator();
	while(sheets.hasNext()) {
		Sheet sh=sheets.next();
		System.out.println("Sheet name is "+sh.getSheetName());
		System.out.println(".................");
		Iterator<Row> iterator=sh.iterator();
		while(iterator.hasNext()) {
			Row row=iterator.next();
			Iterator <Cell>cellIterator=row.iterator();
			while(cellIterator.hasNext()) {
				Cell cell=cellIterator.next();
				String cellValue=dataformatter.formatCellValue(cell);
				
				//if(cell.getCellType()==CellType.STRING) {
				//
				//}
				System.out.println(cellValue+"\t");
					
				}
			System.out.println();
			}
		workbook.close();
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}


}
}