package jorge.iphone;

public class IPhoneMain {

    public static void main(String[] args) {
        AbstractProcessor processor = new SnapdragonProcess("Modelo 1", 2, 3.5, "1.0");
        AbstractMemory ramMemory = new RAMMemory(8, "GB", 5.6);
        AbstractMemory romMemory = new ROMMemory(2, "GB", 3.6);
        AbstractCamera camera = new BasicCamera("Camera model 1", 3, "24 MP", 18.5, "3.6");
        IPhone iphone1 = new IPhone("IPhone 1", processor, "860x128", ramMemory, romMemory, camera);

        AbstractProcessor processor2 = new SnapdragonProcess("Modelo 2", 4, 6.8, "1.5");
        AbstractMemory ramMemory2 = new RAMMemory(16, "GB", 5.0);
        AbstractMemory romMemory2 = new ROMMemory(1, "GB", 1.5);
        AbstractCamera camera2 = new BasicCamera("Camera model 2", 5, "64 MP", 46.0, "1.2");
        IPhone iphone2 = new IPhone("IPhone 2", processor2, "860x128", ramMemory2, romMemory2, camera2);

        iphone1.printSpecifications();
        iphone2.printSpecifications();

        System.out.println("Total: " + calculateTotalSale(iphone1, iphone2));
    }

    public static double calculateTotalSale(ISaleProduct... products) {
        double total = 0;
        for (ISaleProduct product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
