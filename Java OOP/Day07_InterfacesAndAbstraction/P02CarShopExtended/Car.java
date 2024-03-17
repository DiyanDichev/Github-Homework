package Day07_InterfacesAndAbstraction.P02CarShopExtended;

public interface Car {
    int TIRES = 4;
    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
