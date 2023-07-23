package org.example;

import javax.swing.text.Document;

public class ReportEntrypoint {
    public Report create(Document document, ReportCreater reportType) {

        return reportType.createReport((org.example.Document) document);

    }

}