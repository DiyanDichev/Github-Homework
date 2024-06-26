package Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.cocktails.interfaces;

import Java_OOP_Exams.December2022Regular.christmasPastryShop.common.ExceptionMessages;

public class BaseCocktail implements Cocktail{

    private String name;
    private int size;
    private double price;
    private String brand;

    public BaseCocktail(String name, int size, double price, String brand) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NAME);
        }
        this.name = name;
    }

    @Override
    public int getSize() {
        return this.size;
    }
    public void setSize(int size) {
        if(size <= 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_SIZE);
        }
        this.size = size;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PRICE);
        }
        this.price = price;
    }
    @Override
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        if(brand == null || brand.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_BRAND);
        }
        this.brand = brand;
    }

    public String toString(){
        return String.format("%s %s - %d - %.2f",this.name, this.brand, this.size, this.price);
    }
}
