package org.marksoft;

import org.junit.Test;
import java.io.InputStream;

public class TableExtractorTest {

    @Test
    public void testExtractTables() throws Exception {
        TableExtractor tableExtractor = new TableExtractor();
        try(InputStream is = this.getClass().getClassLoader().getResourceAsStream("tables.pdf")) {
            tableExtractor.extractTables(is);
        }
    }

    @Test
    public void testExtractTablesFromEuropass() throws Exception {
        TableExtractor tableExtractor = new TableExtractor();
        try(InputStream is = this.getClass().getClassLoader().getResourceAsStream("cv-example-1-en-gb.pdf")) {
            tableExtractor.extractTables(is);
        }
    }
}