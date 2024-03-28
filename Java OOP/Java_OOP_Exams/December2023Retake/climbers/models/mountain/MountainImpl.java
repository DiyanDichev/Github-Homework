package Java_OOP_Exams.December2023Retake.climbers.models.mountain;

import Java_OOP_Exams.December2023Retake.climbers.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public class MountainImpl implements Mountain{

    private String name;
    private Collection<String> peakList;

    public MountainImpl(String name) {
        setName(name);
        this.peakList = new ArrayList<>();
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.MOUNTAIN_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<String> getPeaksList() {
        return peakList;
    }

    @Override
    public String getName() {
        return name;
    }
}
