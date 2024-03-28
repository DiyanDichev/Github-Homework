package Day07_InterfacesAndAbstraction.P04SayHelloExtended;

public class European extends BasePerson {
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return String.format("Hello");
    }

}
