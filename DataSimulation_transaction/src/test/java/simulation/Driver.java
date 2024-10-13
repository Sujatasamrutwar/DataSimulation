package simulation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class Driver {

	public static String path;
	public static void main(String[] args) throws Throwable {
		path = args[0];
		String TRANSACTION_ID_VAR = "";
		String TRANSACTION_DATE_VAR = "";
		String TRANSACTION_AMOUNT_VAR = "";
		String PAYER_PSP_VAR = "";
		String PAYEE_PSP_VAR = "";
		
	//path = "‪C:\\Users\\User\\Desktop\\New folder\\bank2.xlsx";
	
		
	 ExcelUtility2 eLib = new ExcelUtility2();
	 //path = "‪‪C:\\Users\\User\\Desktop\\ddtfile\\bank2.xlsx";
	
	 int rowCount = eLib.getRowcount("bank");
	
	for(int i=0; i<rowCount; i++) {
		//TRANSACTION_ID_VAR = "HDFC0012"+ new Random().nextint(1000);
		TRANSACTION_ID_VAR = eLib.getDataFromExcel("bank", i, 0);
		
		//TRANSACTION_DATE_VAR = new SimpleDateFormat("dd-MM-yyyy").format(new Date));
		TRANSACTION_DATE_VAR = eLib.getDataFromExcel("bank", i, 1);
		TRANSACTION_AMOUNT_VAR = eLib.getDataFromExcel("bank", i, 2);
		PAYER_PSP_VAR = eLib.getDataFromExcel("bank", i, 3);
		PAYEE_PSP_VAR = eLib.getDataFromExcel("bank", i, 4);
		
		eLib.setDataIntoExcel("bank", i, 0, TRANSACTION_ID_VAR);
		eLib.setDataIntoExcel("bank", i, 1, TRANSACTION_DATE_VAR);
		
		System.out.println(TRANSACTION_ID_VAR);
		System.out.println(TRANSACTION_DATE_VAR);
		System.out.println(TRANSACTION_AMOUNT_VAR);
		System.out.println(PAYER_PSP_VAR);
		System.out.println(PAYEE_PSP_VAR);
		
		/*Object reqBody = ""
				given().contentType(ContentType.JSON).body(reqBody)
				.when().post("http://49.249.29.5.8091/add-transaction")
				.then().log().all();*/
				
	}
	}

}
