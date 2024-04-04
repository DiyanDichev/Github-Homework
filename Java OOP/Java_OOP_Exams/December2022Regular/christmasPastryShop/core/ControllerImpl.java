package Java_OOP_Exams.December2022Regular.christmasPastryShop.core;

import Java_OOP_Exams.December2022Regular.christmasPastryShop.core.interfaces.Controller;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.delicacies.interfaces.Delicacy;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.booths.interfaces.Booth;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces.BoothRepository;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces.CocktailRepository;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces.DelicacyRepository;

public class ControllerImpl implements Controller {

    public ControllerImpl(DelicacyRepository<Delicacy> delicacyRepository, CocktailRepository<Cocktail> cocktailRepository, BoothRepository<Booth> boothRepository) {
    }


    @Override
    public String addDelicacy(String type, String name, double price) {
        // TODO
        return null;
    }

    @Override
    public String addCocktail(String type, String name, int size, String brand) {
        //TODO
        return null;
    }

    @Override
    public String addBooth(String type, int boothNumber, int capacity) {
        //TODO
        return null;
    }

    @Override
    public String reserveBooth(int numberOfPeople) {
        //TODO
        return null;
    }

    @Override
    public String leaveBooth(int boothNumber) {
        //TODO
        return null;
    }

    @Override
    public String getIncome() {
        //TODO
        return null;
    }
}
