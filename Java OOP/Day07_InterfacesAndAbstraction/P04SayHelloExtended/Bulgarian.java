package Day07_InterfacesAndAbstraction.P04SayHelloExtended;

public class Bulgarian extends BasePerson {
    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return String.format("Здравей");
    }
}
