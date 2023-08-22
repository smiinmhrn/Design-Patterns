package behavioural.ChainOfResponsibility;

public class Demo {
    public static void show() {
        var excelReader = new ExcelReader();
        var numbersReader = new NumbersReader();
        var quickBooksReader = new QuickBooksReader();

        quickBooksReader.setNext(numbersReader);
        numbersReader.setNext(excelReader);

        quickBooksReader.read("data.xls");
        quickBooksReader.read("data.numbers");
    }
}
