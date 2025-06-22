public class PdfDocumentFactory extends DocumentFactory{
    
    public Document createDocument() {
        System.out.println("Pdf document created Successfully!!");
        return new PdfDocument();
    }
}
