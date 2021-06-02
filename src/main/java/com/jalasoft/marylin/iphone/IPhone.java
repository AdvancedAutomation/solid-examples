public class IPhone {
    private final Model model;
    private final Processor processor;
    private final Resolution resolution;
    private final Ram ram;
    private final Rom rom;

    public IPhone(IPhoneBuilder iPhoneBuilder) {
        this.model = iPhoneBuilder.getModel();
        this.processor = iPhoneBuilder.getProcessor();
        this.resolution = iPhoneBuilder.getResolution();
        this.ram = iPhoneBuilder.getRam();
        this.rom = iPhoneBuilder.getRom();
    }

    public Model getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public Ram getRam() {
        return ram;
    }

    public Rom getRom() {
        return rom;
    }
}
