package ExelDemo;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDemo1 {


    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\ONUR\\OneDrive\\Masaüstü\\Test XLSX Worksheet.xlsx";
        FileInputStream fileInputstream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputstream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);


        System.out.println(row.getCell(0));


    }
}