package theme04InterfaceAndAbstraction.lab.p03_04SayHello;

public class Bulgarian extends BasePerson implements Person{

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
