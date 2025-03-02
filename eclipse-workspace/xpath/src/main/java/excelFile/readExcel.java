package excelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel 
{
public static  void main(String[] args) throws IOException 
{
	//excel-->workbook--->sheets---->Rows----->cells
	//fileinputstream-->Read data 
	//fileoutputstreem-->write data
	//rows count from 0
	//cell are counting from 1
    FileInputStream file = new FileInputStream("C:\\Users\\abhit\\eclipse-workspace\\xpath\\testdata\\Sample.xlsx");
    XSSFWorkbook book = new XSSFWorkbook(file);
    XSSFSheet sheet = book.getSheet("Sheet1"); // sheet name
    int totalrow = sheet.getLastRowNum(); // return last row no
    int totalcell = sheet.getRow(0).getLastCellNum(); // corrected row index to 0

    System.out.println("No of rows: " + totalrow);
    System.out.println("No of cells: " + totalcell);

    for (int r = 0; r <= totalrow; r++) {
        XSSFRow currentrow = sheet.getRow(r);

        if (currentrow != null) { // added null check
            for (int c = 0; c < totalcell; c++) { // changed condition to '< totalcell'
                XSSFCell cell = currentrow.getCell(c);

                if (cell != null) { // added null check
                    System.out.print(cell.toString() + "\t");
                } else {
                    System.out.print("\t"); // to keep the tab space in case of null cell
                }
            }
            System.out.println();
        }
    }

    book.close();
    file.close();
}
}

