package Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.booths.interfaces;

import Java_OOP_Exams.December2022Regular.christmasPastryShop.common.ExceptionMessages;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.delicacies.interfaces.Delicacy;

import java.util.ArrayList;
import java.util.Collection;

public class BaseBooth implements Booth{
    private Collection<Delicacy> delicacyOrders = new ArrayList<>();
    private Collection<Cocktail> cocktailOrders = new ArrayList<>();
    private int boothNumber;
    private int capacity;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReserved;
    private double price;


    public BaseBooth(int boothNumber, int capacity, double pricePerPerson) {
        this.boothNumber = boothNumber;
        this.setCapacity(capacity);
        this.isReserved = false;
        this.price = 0;
    }

    @Override
    public int getBoothNumber() {
        return this.boothNumber;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity <= 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_TABLE_CAPACITY);
        }
        this.capacity = capacity;
    }

    public int getNumberOfPeople() {
        return this.numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        if(numberOfPeople <= 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NUMBER_OF_PEOPLE);
        }
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public boolean isReserved() {
        return this.isReserved;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void reserve(int numberOfPeople) {
        this.setNumberOfPeople(numberOfPeople);
        isReserved = true;
        this.price = this.pricePerPerson * numberOfPeople;
    }

    @Override
    public double getBill() {
        double bill = 0;
        bill += delicacyOrders.stream().mapToDouble(Delicacy::getPrice).sum();
        bill += cocktailOrders.stream().mapToDouble(Cocktail::getPrice).sum();
        bill += getPrice();
        return bill;
    }

    @Override
    public void clear() {
        this.isReserved = false;
        this.numberOfPeople = 0;
        this.delicacyOrders.clear();
        this.cocktailOrders.clear();
        this.price = 0;
    }
    public void orderDelicacy(Delicacy delicacy) {
        delicacyOrders.add(delicacy);
    }
    public void orderCocktail(Cocktail cocktail){
        this.cocktailOrders.add(cocktail);
    }
}
