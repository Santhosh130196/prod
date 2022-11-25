package org.xcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xcel {
public static void main(String[] args) throws IOException {
	File excelloc=new File("C:\\Users\\ASUS\\eclipse-workspace\\Maven\\xcel\\onepiece.xlsx");
	FileInputStream fin = new FileInputStream(excelloc);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("ATT");
	  Row r = s.getRow(3);
		Cell c = r.getCell(0);
		String sc = c.getStringCellValue();
		System.out.println(sc);
		if (sc.equals("luffy")) {
			c.setCellValue("monkeyd");
		
		}
	FileOutputStream fout = new FileOutputStream(excelloc);
	w.write(fout);
	System.out.println("done");
	}
	
}

