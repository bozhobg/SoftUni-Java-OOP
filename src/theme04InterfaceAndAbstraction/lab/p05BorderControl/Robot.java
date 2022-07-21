package theme04InterfaceAndAbstraction.lab.p05BorderControl;

public class Robot extends IdentifiableImpl implements Identifiable{

    private String model;


    public Robot(String model, String id) {
        super(id);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return super.getId();
    }

}
