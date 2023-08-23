package Creational.AbstractFactory;

public class Demo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new WeightLossFactory());
    }
}
