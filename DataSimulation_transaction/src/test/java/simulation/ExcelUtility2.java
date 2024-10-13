package simulation;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExcelUtility2 {
		String testDataPath = Driver.path;
			
		public String getDataFromExcel(String sheetName, int rowNum, int celNum) throws Throwable {
			FileInputStream fis= new FileInputStream(testDataPath);
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
			wb.close();
			return data;	
		}
	public int getRowcount(String sheetName) throws Throwable {
			
			FileInputStream fis = new FileInputStream(testDataPath);
			Workbook wb = WorkbookFactory.create(fis);
			int rowCount = wb.getSheet(sheetName).getLastRowNum();
			wb.close();
			return rowCount;	
		}
	public String setDataIntoExcel(String sheetName, int rowNum, int cellNum, String data) throws EncryptedDocumentException, IOException 
		{
			
			FileInputStream fis=new FileInputStream(testDataPath);
			
			Workbook wb=WorkbookFactory.create(fis);

			wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
			
			FileOutputStream fos= new FileOutputStream(testDataPath);
			wb.write(fos);
			wb.close();
			return data;
		}}
		
		
	

