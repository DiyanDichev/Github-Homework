package Java_OOP_Exams.December2022Retake.magicGame.repositories.interfaces;

import Java_OOP_Exams.December2022Retake.magicGame.common.ExceptionMessages;
import Java_OOP_Exams.December2022Retake.magicGame.models.magics.Magic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MagicRepositoryImpl implements MagicRepository{

    private Collection<Magic> data;

    public MagicRepositoryImpl() {
        this.data = new ArrayList<>();
    }

    @Override
    public Collection getData() {
        return Collections.unmodifiableCollection(this.data);
    }

    @Override
    public void addMagic(Magic magic) {
        if(magic == null){
            throw new NullPointerException(ExceptionMessages.INVALID_MAGIC_REPOSITORY);
        }
        this.data.add(magic);
    }

    @Override
    public boolean removeMagic(Magic magic) {
        return data.remove(magic);
    }

    @Override
    public Object findByName(String name) {
        for (Magic data : this.data) {
            if(data.getName().equals(name)){
                return data;
            }
        }
        return null;
    }
}
