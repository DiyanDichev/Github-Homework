package Day07_InterfacesAndAbstraction.P04SayHelloExtended;

public class Chinese extends BasePerson {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return String.format("Djydjybydjy");
    }

}
