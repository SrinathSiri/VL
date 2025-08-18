package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadData {

    public static void main(String[] args) throws IOException{

            File file = new File("C:\\Users\\v-srinath.sirimalla\\Downloads\\Testdata.xlsx");
            FileInputStream fis = new FileInputStream(file);
            Workbook workbook =  WorkbookFactory.create(fis);
            System.out.println(workbook.getNumberOfSheets());
            Sheet sheet = workbook.getSheet("Sheet1");
            /*System.out.println("Physical number of rows : "+sheet.getPhysicalNumberOfRows());
            System.out.println("First Row number is : "+sheet.getFirstRowNum());
            System.out.println("Last Row number is : "+sheet.getLastRowNum());
            System.out.println("Physical number of columns is : "+sheet.getRow(0).getPhysicalNumberOfCells());
            System.out.println("First cell number is : "+sheet.getRow(0).getFirstCellNum());
            System.out.println("Last Cell number is : "+sheet.getRow(0).getLastCellNum());*/

            for(int rowindex=sheet.getFirstRowNum()+1;rowindex<=sheet.getLastRowNum();rowindex++){
                for(int colindex=sheet.getRow(rowindex).getFirstCellNum();colindex<sheet.getRow(rowindex).getLastCellNum();colindex++){
                    System.out.println(sheet.getRow(rowindex).getCell(colindex).toString()+"\t");
                }
            }

    }

}
