package dataprovideer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprov {

	@Test(dataProvider="driveTest")
	public void testcasedata(String greeting,String communication,String id) {
	
		System.out.println(greeting+communication+id);
	}
	@DataProvider(name="driveTest")
	public void getData() throws IOException {
		
		//Object[][] data= {{"hello","text","1"},{"bye","cu","2"},{"solo","call","3"}};
		FileInputStream fis = new FileInputStream("C:\\Users\\AS086960\\OneDrive - Cerner Corporation\\Documents\\excelDriven.xlsx");
		//XSSFWorkbook workbook = new XSSFWorkbook();
		//return null;
		
		
		
		
		
		//return data;
	}
}
