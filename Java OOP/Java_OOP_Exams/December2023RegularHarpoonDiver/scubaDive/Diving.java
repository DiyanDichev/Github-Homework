package Java_OOP_Exams.December2023RegularHarpoonDiver.scubaDive;

import java.util.ArrayList;
import java.util.Collection;

public class Diving {
    private static final String INVALID_DIVING_SITE = "Invalid diving site!";
    private static final String INVALID_CAPACITY = "Invalid capacity!";
    private static final String NO_MORE_PLACES = "No more places for this dive!"; //TODO
    private static final String DIVER_EXIST = "The diver %s is already in the dive!";
    private static final int ZERO_CAPACITY = 0;

    private int capacity;
    private String name;
    private Collection<DeepWaterDiver> divers;

    public Diving(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
        this.divers = new ArrayList<>();
    }

    public int getCount() {
        return this.divers.size();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addDeepWaterDiver(DeepWaterDiver diver) {
        if (divers.size() == this.getCapacity()) {
            throw new IllegalArgumentException(NO_MORE_PLACES);
        }
        boolean diverExist = this.divers
                .stream()
                .anyMatch(a -> a.getName().equals(diver.getName()));

        if (diverExist) {
            throw new IllegalArgumentException(String.format(DIVER_EXIST, diver.getName()));
        }

        this.divers.add(diver);
    }

    public boolean removeDeepWaterDiver(String diverName) {
        DeepWaterDiver diver = this.divers
                .stream()
                .filter(a -> a.getName().equals(diverName))
                .findFirst()
                .orElse(null);

        boolean isRemove = this.divers.remove(diver);
        return isRemove;
    }

    private void setCapacity(int capacity) {
        if (capacity < ZERO_CAPACITY) {
            throw new IllegalArgumentException(INVALID_CAPACITY);
        }
        this.capacity = capacity;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(INVALID_DIVING_SITE);
        }
        this.name = name;
    }
}
