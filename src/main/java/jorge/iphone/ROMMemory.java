package jorge.iphone;

public class ROMMemory extends AbstractMemory {

    public ROMMemory(int size, String storageMeasure, double price) {
        super(size, storageMeasure, price);
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    @Override
    public String getTypeMemory() {
        return "ROM";
    }
}
