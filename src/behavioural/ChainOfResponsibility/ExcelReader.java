package behavioural.ChainOfResponsibility;

public class ExcelReader extends DataReader{
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }
}
