package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReadExcel {
    @Test
    public void excelDataRead() throws IOException {

        File file = new File("C:\\Users\\v-srinath.sirimalla\\AutomationWorkspace\\SFLYFW\\exceldata\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fis);
        System.out.println("Total sheets : " + workbook.getNumberOfSheets());
        Sheet sheet = workbook.getSheet("Sheet1");
        sheet.getPhysicalNumberOfRows();

        for(int rowIndex=sheet.getFirstRowNum()+1;rowIndex<=sheet.getLastRowNum();rowIndex++){
            for(int colIndex=sheet.getRow(1).getFirstCellNum();colIndex<sheet.getRow(1).getLastCellNum();colIndex++){
                System.out.println("Each Cell value is : "+sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue());
            }
        }
        workbook.close();
        fis.close();


    }
}
