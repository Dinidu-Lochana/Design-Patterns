public class Main {
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        msiGpu.assemble();
        Monitor msiMonitor = msi.createMonitor();
        msiMonitor.assemble();

        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        asusGpu.assemble();
        Monitor asusMonitor = asus.createMonitor();
        asusMonitor.assemble();
    }
}