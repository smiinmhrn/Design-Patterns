package behavioural.Observer;

public class Demo {
    public static void show() {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("stock1", 1);
        var stock2 = new Stock("stock2", 2);
        var stock3 = new Stock("stock3", 3);

        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        stock2.setPrice(20);

        stock3.setPrice(10);
    }
}
