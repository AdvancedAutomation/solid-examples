package jorge.iphone;

public abstract class AbstractProcessor implements IDeviceComponent, ISoftwareDevice {

    protected String model;
    protected int numberOfCores;
    protected double price;
    private String version;

    public AbstractProcessor(String Model, int NumberOfCores, double price, String version) {
        this.model = Model;
        this.numberOfCores = NumberOfCores;
        this.price = price;
        this.version = version;
    }

    public final String getSpecification() {
        StringBuilder specification = new StringBuilder();
        specification.append("Processor");
        specification.append("  Model: " + model);
        specification.append("  Number of Cores: " + numberOfCores);
        specification.append("  Version: " + version);
        return specification.toString();
    }

    public void upgrade(String version) {
        this.version = version;
    }

    public void downgrade(String version) {
        this.version = version;
    }

    public final double getPrice() {
        return price;
    }
}
