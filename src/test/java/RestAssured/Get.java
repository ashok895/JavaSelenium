package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Get {
    @Test
    public void run() throws IOException {
String url =  "https://reqres.in/api/users?page=2";
        Response response;
        response = RestAssured.get(url);
        response.getBody();
        int code = response.getStatusCode();
        System.out.println(code);
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("sheet1");
        Row headerrow = sheet.createRow(0);
        Cell cell = headerrow.createCell(0);
        headerrow.createCell(0).setCellValue("Status_code_value");
        cell.setCellValue(code);

        try (FileOutputStream fileOut = new FileOutputStream("D:\\ASHOK/test1_results.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path = "D:\\ASHOK/test1_results.xlsx";
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh = wb.getSheetAt(0);
        int rownum = (int) sh.getRow(0).getCell(0).getNumericCellValue();
        System.out.println(rownum);
        Assert.assertEquals(code,rownum);


    }
}
