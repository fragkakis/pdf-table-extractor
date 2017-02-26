package org.marksoft;

import com.snowtide.PDF;
import com.snowtide.pdf.Document;
import com.snowtide.pdf.Page;
import com.snowtide.pdf.layout.Table;
import com.snowtide.pdf.util.TableUtils;

import java.io.InputStream;
import java.util.List;

public class TableExtractor {

    public void extractTables(InputStream pdfIs) {
        Document pdf = PDF.open(pdfIs, "tables.pdf");
        for(Page page : pdf.getPages()) {
            List<Table> tables = TableUtils.getAllTables(page);
            for(Table table : tables) {
                String tableCsv = TableUtils.convertToCSV(table, ',');
                System.out.println(tableCsv);
            }

        }
    }

}
