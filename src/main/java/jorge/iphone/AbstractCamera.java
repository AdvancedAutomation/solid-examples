package jorge.iphone;

public abstract class AbstractCamera implements IDeviceComponent, ISoftwareDevice {

    private String model;
    private double price;
    private int noCamera;
    private String resolution;
    private String version;

    public AbstractCamera(String model, int noCamera, String resolution, double price, String version) {
        this.model = model;
        this.noCamera = noCamera;
        this.price = price;
        this.resolution = resolution;
        this.version = version;
    }

    public final String getSpecification() {
        StringBuilder specifications = new StringBuilder();
        specifications.append("Camera");
        specifications.append("  Model: " + model);
        specifications.append("  Number of Camera: " + noCamera);
        specifications.append("  Resolution: " + resolution);
        specifications.append("  Version: " + version);
        return specifications.toString();
    }

    public final void upgrade(String version) {
        this.version = version;
    }

    public final void downgrade(String version) {
        this.version = version;
    }

    public final double getPrice() {
        return price;
    }
}
