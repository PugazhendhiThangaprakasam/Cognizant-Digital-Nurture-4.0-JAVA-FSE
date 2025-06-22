
public class Main {
    public static void main(String[] args) {

        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        Document wordDocument = wordDocumentFactory.createDocument();
        wordDocument.open();

        DocumentFactory excelDocumentFactory = new ExcelDocumentFactory();
        Document excelDocument = excelDocumentFactory.createDocument();
        excelDocument.open();

        DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfDocumentFactory.createDocument();
        pdfDocument.open();
    }
}
