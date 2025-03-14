package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class cPlaneTeste {

    private Workbook workbook;
    private Sheet sheet;
    private Row row;
    private Cell cell;

    @BeforeEach
    public void setUp() {
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Planilha2");
        row = sheet.createRow(5);
        cell = row.createCell(5);
    }

    @Test
    public void testCellValue() {
        cell.setCellValue("Hi, baby! :D");
        assertEquals("Hi, baby! :D", cell.getStringCellValue());
    }
}