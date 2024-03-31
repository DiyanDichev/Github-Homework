package Java_OOP_Exams.December2022Retake.magicGame.repositories.interfaces;

import Java_OOP_Exams.December2022Retake.magicGame.common.ExceptionMessages;
import Java_OOP_Exams.December2022Retake.magicGame.models.magicians.Magician;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MagicianRepositoryImpl implements MagicianRepository{

    private Collection<Magician> data;

    public MagicianRepositoryImpl() {
        this.data = new ArrayList<>();
    }

    @Override
    public Collection getData() {
        return Collections.unmodifiableCollection(this.data);
    }

    @Override
    public void addMagician(Magician magician) {
        if(magician == null){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC_REPOSITORY);
        }
        this.data.add(magician);
    }

    @Override
    public boolean removeMagician(Magician magician) {
        return data.remove(magician);
    }

    @Override
    public Object findByUsername(String name) {
        for (Magician data : this.data) {
            if(data.getUsername().equals(name)){
                return data;
            }
        }
        return null;
    }
}
