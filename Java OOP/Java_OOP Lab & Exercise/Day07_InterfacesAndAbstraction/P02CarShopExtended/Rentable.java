package Day07_InterfacesAndAbstraction.P02CarShopExtended;

public interface Rentable extends Car{
    Integer getMinRentDay();
    Double getPricePerDay();
}
