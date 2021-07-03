package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[][] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int row = ws.getLastRowNum();																																																																																																																																																																																																																																																																							
		int col = ws.getRow(0).getLastCellNum();
		for(int i=1;i<=row;i++) {
			for(int j=0;j<col;j++) {
				String value= ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		// TODO Auto-generated method stub
wb.close();
	}

}
