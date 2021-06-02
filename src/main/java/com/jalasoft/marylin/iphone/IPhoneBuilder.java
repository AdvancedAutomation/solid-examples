public class IPhoneBuilder {
    private Model model;
    private Processor processor;
    private Resolution resolution;
    private Ram ram;
    private Rom rom;

    public IPhoneBuilder() {

    }

    public Model getModel() {
        return this.model;
    }

    public IPhoneBuilder setModel(Model model) {
        this.model = model;
        return this;
    }

    public Processor getProcessor() {
        return this.processor;
    }

    public IPhoneBuilder setProcessor(Processor processor) {
        this.processor = processor;
        return this;
    }

    public Resolution getResolution() {
        return this.resolution;
    }

    public IPhoneBuilder setResolution(Resolution resolution) {
        this.resolution = resolution;
        return this;
    }

    public Ram getRam() {
        return this.ram;
    }

    public IPhoneBuilder setRam(Ram ram) {
        this.ram = ram;
        return this;
    }

    public Rom getRom() {
        return this.rom;
    }

    public IPhoneBuilder setRom(Rom rom) {
        this.rom = rom;
        return this;
    }

    public IPhone build() {
        IPhone iPhone = new IPhone(this);
        return iPhone;
    }
}
