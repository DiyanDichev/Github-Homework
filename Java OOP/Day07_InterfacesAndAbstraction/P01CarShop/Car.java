package Day07_InterfacesAndAbstraction.P01CarShop;

public interface Car {
    int TIRES = 4;
    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
