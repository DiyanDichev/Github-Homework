package Java_OOP_Exams.December2022Retake.magicGame.core;

import Java_OOP_Exams.December2022Retake.magicGame.models.region.RegionImpl;
import Java_OOP_Exams.December2022Retake.magicGame.repositories.interfaces.MagicRepository;
import Java_OOP_Exams.December2022Retake.magicGame.repositories.interfaces.MagicRepositoryImpl;
import Java_OOP_Exams.December2022Retake.magicGame.repositories.interfaces.MagicianRepository;
import Java_OOP_Exams.December2022Retake.magicGame.repositories.interfaces.MagicianRepositoryImpl;
import Java_OOP_Exams.December2022Retake.magicGame.common.ExceptionMessages;
import Java_OOP_Exams.December2022Retake.magicGame.common.OutputMessages;
import Java_OOP_Exams.December2022Retake.magicGame.models.magicians.BlackWidow;
import Java_OOP_Exams.December2022Retake.magicGame.models.magicians.Magician;
import Java_OOP_Exams.December2022Retake.magicGame.models.magicians.Wizard;
import Java_OOP_Exams.December2022Retake.magicGame.models.magics.BlackMagic;
import Java_OOP_Exams.December2022Retake.magicGame.models.magics.Magic;
import Java_OOP_Exams.December2022Retake.magicGame.models.magics.RedMagic;
import Java_OOP_Exams.December2022Retake.magicGame.models.region.Region;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {

    private MagicRepository<Magic> magics;
    private MagicianRepository<Magician> magicians;
    private Region region;

    public ControllerImpl() {
        this.magics = new MagicRepositoryImpl();
        this.magicians = new MagicianRepositoryImpl();
        this.region = new RegionImpl();
    }

    @Override
    public String addMagic(String type, String name, int bulletsCount) {
        Magic magic;
        switch (type) {
            case "RedMagic":
                magic = new RedMagic(name, bulletsCount);
                break;
            case "BlackMagic":
                magic = new BlackMagic(name, bulletsCount);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_MAGIC_TYPE);
        }
        this.magics.addMagic(magic);
        return String.format(OutputMessages.SUCCESSFULLY_ADDED_MAGIC, name);
    }

    @Override
    public String addMagician(String type, String username, int health, int protection, String magicName) {
        Magician magician;
        Magic magic = this.magics.findByName(magicName);
        if (magic == null) {
            throw new IllegalArgumentException(ExceptionMessages.MAGIC_CANNOT_BE_FOUND);
        }
        switch (type) {
            case "Wizard":
                magician = new Wizard(username, health, protection, magic);
                break;
            case "BlackWidow":
                magician = new BlackWidow(username, health, protection, magic);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_MAGICIAN_TYPE);
        }
        this.magicians.addMagician(magician);
        return String.format(OutputMessages.SUCCESSFULLY_ADDED_MAGICIAN, username);
    }

    @Override
    public String startGame() {
        return this.region.start(this.magicians.getData());
    }

    @Override
    public String report() {
        List<Magician> magicianName = this.magicians.getData().stream()
                .sorted(Comparator.comparing(Magician::getHealth)
                        .thenComparing(Magician::getUsername))
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (Magician magician : magicianName) {
            sb.append(String.format("%s",magician.toString()));
        }
        return sb.toString().trim();
    }
}
