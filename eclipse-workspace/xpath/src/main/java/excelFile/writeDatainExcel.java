package excelFile;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDatainExcel
{
public static void main(String[] args) throws IOException 
{
    FileOutputStream file = new FileOutputStream("C:\\Users\\abhit\\OneDrive\\Desktop\\myfile.xlsx");
    XSSFWorkbook book = new XSSFWorkbook();
    XSSFSheet sheet = book.createSheet("Data");

    // Create the first row and set cell values
    XSSFRow row1 = sheet.createRow(0);
    row1.createCell(0).setCellValue("Welcome");
    row1.createCell(1).setCellValue(1234);
    row1.createCell(2).setCellValue("Automation");
    row1.createCell(3).setCellValue("Welcome java");
    row1.createCell(4).setCellValue("Welcome c++");

    // Create the second row and set cell values
    XSSFRow row2 = sheet.createRow(1); // Changed to row index 1
    row2.createCell(0).setCellValue("Welcome pune");
    row2.createCell(1).setCellValue(7654);
    row2.createCell(2).setCellValue("new Automation");
    row2.createCell(3).setCellValue("Welcome thane");
    row2.createCell(4).setCellValue("Welcome vbb");

    // Write the workbook to the file
    book.write(file);
    book.close();
    file.close();
}
}
