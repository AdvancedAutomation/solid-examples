import java.util.ArrayList;
import java.util.List;

public class Sales {

    int quantity;
    List<IPhone> iPhones;

    public Sales() {
        quantity = 1;
        iPhones = new ArrayList<>();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<IPhone> getiPhones() {
        return iPhones;
    }

    public void setiPhone(IPhone iPhone) {
        this.iPhones.add(iPhone);
    }

    public static void main(String[] args) {
        Sales sales = new Sales();

        IPhone iPhone = new IPhoneBuilder()
                .setModel(new Model())
                .setProcessor(new Processor())
                .setResolution(new Resolution())
                .setRam(new Ram())
                .setRom(new Rom())
                .build();

        sales.setiPhone(iPhone);
    }
}
