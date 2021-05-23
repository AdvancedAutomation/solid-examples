package jorge.iphone;

public class RAMMemory extends AbstractMemory {

    public RAMMemory(int size, String storageMeasure, double price) {
        super(size, storageMeasure, price);
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Override
    public String getTypeMemory() {
        return "RAM";
    }
}
