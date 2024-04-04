package Java_OOP_Exams.December2022Regular.christmasPastryShop;

import Java_OOP_Exams.December2022Regular.christmasPastryShop.core.interfaces.Controller;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.delicacies.interfaces.Delicacy;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.booths.interfaces.Booth;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces.BoothRepository;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces.CocktailRepository;
import Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces.DelicacyRepository;

public class Main {
    public static void main(String[] args) {

        String a = " ";
        int a1 = a.length();
        DelicacyRepository<Delicacy> delicacyRepository; // TODO: new DelicacyRepositoryImpl<>();
        CocktailRepository<Cocktail> cocktailRepository; // TODO: new CocktailRepositoryImpl<>();
        BoothRepository<Booth> boothRepository; // TODO: new BoothRepositoryImpl<>();

        Controller controller; // TODO: new ControllerImpl(delicacyRepository, cocktailRepository, boothRepository);

        // TODO:OPTIONAL

        //  ConsoleReader reader = new ConsoleReader();
        // ConsoleWriter writer = new ConsoleWriter();
        // EngineImpl engine = new EngineImpl(reader, writer, controller);
        // engine.run();

    }
}
