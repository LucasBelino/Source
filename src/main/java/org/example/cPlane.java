package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class cPlane  {
    public static void main(String[] args) {

        try (Workbook workbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.createSheet("Planilha2");
            Row row = sheet.createRow(5);
            Cell cell = row.createCell(5);

            cell.setCellValue("Hi, baby! :D");
            try (FileOutputStream fileOut = new FileOutputStream("output2.xlsx")) {
                workbook.write(fileOut);
            }
            System.out.println("Planilha 2 criada com sucesso!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}