package Java_OOP_Exams.December2023RetakeClimbers.climbers.models.mountain;

import Java_OOP_Exams.December2023RetakeClimbers.climbers.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public class MountainImpl implements Mountain{

    private String name;
    private Collection<String> peaksList;

    public MountainImpl(String name) {
        this.setName(name);
        this.peaksList = new ArrayList<>();
    }

    @Override
    public Collection<String> getPeaksList() {
        return this.peaksList;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.MOUNTAIN_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
}
