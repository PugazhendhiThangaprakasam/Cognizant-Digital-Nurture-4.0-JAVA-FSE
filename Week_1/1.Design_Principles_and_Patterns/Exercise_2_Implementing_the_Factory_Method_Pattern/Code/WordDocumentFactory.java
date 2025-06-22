public class WordDocumentFactory extends DocumentFactory{
    
    public Document createDocument() {
        System.out.println("Word document created Successfully!!");
        return new WordDocument();
    }

}
