public class Main {
    public static void main(String[] args) {
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(new XmlData());

        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(new XmlData());
    }
}