import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class cPlaneTest {

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
