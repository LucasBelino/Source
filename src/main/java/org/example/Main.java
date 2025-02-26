package org.example;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                try (Workbook workbook = new XSSFWorkbook()) {

                    Sheet sheet = workbook.createSheet("Planilha1");
                    Row row = sheet.createRow(0);
                    Cell cell = row.createCell(0);

                    cell.setCellValue("Olá, Excel :D");
                    try (FileOutputStream fileOut = new FileOutputStream("output.xlsx")) {
                        workbook.write(fileOut);
                    }
                    System.out.println("Planilha criada com sucesso!!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
}