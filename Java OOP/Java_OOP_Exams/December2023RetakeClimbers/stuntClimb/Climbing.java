package Java_OOP_Exams.December2023RetakeClimbers.stuntClimb;

import java.util.ArrayList;
import java.util.Collection;

public class Climbing {
    private static final String INVALID_MOUNTAIN = "Invalid mountain!";
    private static final String INVALID_CAPACITY = "Invalid capacity!";
    private static final String NO_MORE_PLACES = "No more places for this climb!";
    private static final String CLIMBER_EXIST = "The climber %s is already in the climb!";
    private static final int ZERO_CAPACITY = 0;

    private int capacity;
    private String name;
    private final Collection<RockClimber> climbers;

    public Climbing(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
        this.climbers = new ArrayList<>();
    }

    public int getCount() {
        return this.climbers.size();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addRockClimber(RockClimber climber) {
        if (climbers.size() == this.getCapacity()) {
            throw new IllegalArgumentException(NO_MORE_PLACES);
        }
        boolean climberExist = this.climbers
                .stream()
                .anyMatch(a -> a.getName().equals(climber.getName()));

        if (climberExist) {
            throw new IllegalArgumentException(String.format(CLIMBER_EXIST, climber.getName()));
        }

        this.climbers.add(climber);
    }

    public boolean removeRockClimber(String climberName) {
        RockClimber climber = this.climbers
                .stream()
                .filter(a -> a.getName().equals(climberName))
                .findFirst()
                .orElse(null);

        boolean isRemove = this.climbers.remove(climber);
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
            throw new NullPointerException(INVALID_MOUNTAIN);
        }
        this.name = name;
    }
}
