package Java_OOP_Exams.December2023Regular.harpoonDiver.models.divingSite;

import Java_OOP_Exams.December2023Regular.harpoonDiver.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public class DivingSiteImpl implements DivingSite{

    private String name;
    private Collection<String> seaCreatures;
    public DivingSiteImpl(String name) {
        setName(name);
        this.seaCreatures = new ArrayList<>();
    }

    protected void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.SITE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<String> getSeaCreatures() {
        return seaCreatures;
    }

    @Override
    public String getName() {
        return name;
    }
}
