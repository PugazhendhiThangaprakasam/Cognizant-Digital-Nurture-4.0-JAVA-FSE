public class ExcelDocumentFactory extends DocumentFactory{

    public Document createDocument() {
        System.out.println("Excel sheet created Successfully!!");
        return new ExcelDocument();
    }

}
