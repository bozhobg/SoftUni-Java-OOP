package theme04InterfaceAndAbstraction.lab.p05BorderControl;

public abstract class IdentifiableImpl {

    private String id;

    protected IdentifiableImpl(String id) {
        this.id = id;
    }

    protected String getId() {
        return id;
    }

}
