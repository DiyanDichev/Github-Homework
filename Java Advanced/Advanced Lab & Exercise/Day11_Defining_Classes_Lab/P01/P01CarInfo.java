package Day11_Defining_Classes_Lab.P01;

public class P01CarInfo {

    private String brand;
    public String model;
    public int horsePower;


    public String carInfo() {
       return String.format("The car is: %s %s - %d HP.",
                this.getBrand(),
                this.getModel(),
                this.getHorsePower());
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
