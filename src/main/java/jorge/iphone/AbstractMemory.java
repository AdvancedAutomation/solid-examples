package jorge.iphone;

public abstract class AbstractMemory implements IDeviceComponent {

    private String storageMeasure;
    private int size;
    private double price;

    public AbstractMemory(int size, String storageMeasure, double price ) {
        this.size = size;
        this.storageMeasure = storageMeasure;
        this.price = price;
    }

    public final String getSpecification() {
        StringBuilder specification = new StringBuilder();
        specification.append("Memory " + getTypeMemory());
        specification.append("  Size: " + size + " " + storageMeasure);
        specification.append("  Price: " + price);
        return specification.toString();
    }

    public final double getPrice() {
        return price;
    }

    public abstract boolean isReadOnly();
    public abstract String getTypeMemory();
}
