package com.selenium.ui.UpdateExcel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateExcelEmail {

    // Hardcoded file path (or you can load from properties)
    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/testdata/EmployeeData.xlsx";

    // Hardcoded sheet and cell (can be customized)
    private static final String SHEET_NAME = "Sheet1";
    private static final int ROW_INDEX = 1;
    private static final int COL_INDEX = 5;

    // Private helper to update email in Excel and return it
    public static String updateEmailInExcel() throws IOException {
        FileInputStream fis = new FileInputStream(new File(FILE_PATH));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(SHEET_NAME);

        String uniqueEmail = "mpptestautomation+" + UUID.randomUUID().toString().substring(0, 6) + "@gmail.com";

        Row row = sheet.getRow(ROW_INDEX);
        if (row == null) row = sheet.createRow(ROW_INDEX);
        Cell cell = row.getCell(COL_INDEX);
        if (cell == null) cell = row.createCell(COL_INDEX);
        cell.setCellValue(uniqueEmail);

        fis.close();

        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        workbook.write(fos);
        workbook.close();
        fos.close();

        return uniqueEmail;
    }

    // Public method to directly fill email into Selenium field
    public static void fillEmailInForm(WebElement emailField) throws IOException {
        String email = updateEmailInExcel();
        emailField.sendKeys(email);
        System.out.println("Email updated in Excel and entered in form: " + email);
    }

    public static void uploadFile(WebDriver driver, By fileInputLocator, String fileName) {
        try {
            String projectPath = System.getProperty("user.dir");
            String fullPath = projectPath + "/src/main/resources/testdata/" + fileName;

            driver.findElement(fileInputLocator).sendKeys(fullPath);
            System.out.println("✅ File uploaded successfully: " + fileName);
        } catch (Exception e) {
            System.out.println("❌ File upload failed: " + e.getMessage());
        }
    }
}

