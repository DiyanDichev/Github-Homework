package Java_OOP_Exams.December2023RetakeClimbers.climbers.core;

import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climber.Climber;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climbing.Climbing;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climbing.ClimbingImpl;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.mountain.Mountain;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.mountain.MountainImpl;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.repositories.ClimberRepository;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.repositories.MountainRepository;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.repositories.Repository;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.common.ConstantMessages;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.common.ExceptionMessages;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climber.RockClimber;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climber.WallClimber;

import java.util.Collection;
import java.util.List;

public class ControllerImpl implements Controller {

    private Repository<Climber> climberRepository;
    private Repository<Mountain> mountainRepository;
    private int mountainCount;

    public ControllerImpl() {
        this.climberRepository = new ClimberRepository();
        this.mountainRepository = new MountainRepository();
        this.mountainCount = 0;
    }

    @Override
    public String addClimber(String type, String climberName) {
        Climber climber;
        switch (type) {
            case "RockClimber":
                climber = new RockClimber(climberName);
                break;
            case "WallClimber":
                climber = new WallClimber(climberName);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.CLIMBER_INVALID_TYPE);
        }

        this.climberRepository.add(climber);
        return String.format(ConstantMessages.CLIMBER_ADDED, type, climberName);
    }

    @Override
    public String addMountain(String mountainName, String... peaks) {

        Mountain mountain = new MountainImpl(mountainName);
//        for (String peak : peaks) {
//            mountain.getPeaksList().add(peak);
//       }
        mountain.getPeaksList().addAll(List.of(peaks));


        this.mountainRepository.add(mountain);
        return String.format(ConstantMessages.MOUNTAIN_ADDED, mountainName);
    }

    @Override
    public String removeClimber(String climberName) {
        Climber climber = this.climberRepository.byName(climberName);
        if (climber == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.CLIMBER_DOES_NOT_EXIST, climberName));
        }
        this.climberRepository.remove(climber);
        return String.format(ConstantMessages.CLIMBER_REMOVE, climberName);
    }

    @Override
    public String startClimbing(String mountainName) {
//        List<Climber> climber = climberRepository.getCollection().stream().filter(e -> e.getStrength() > 0).collect(Collectors.toList());
//        if (climber.isEmpty()) {
//            throw new IllegalArgumentException(ExceptionMessages.THERE_ARE_NO_CLIMBERS);
//        }

        Collection<Climber> climber = this.climberRepository.getCollection();
        if(climber.isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.THERE_ARE_NO_CLIMBERS);
        }

        Mountain mountain = this.mountainRepository.byName(mountainName);
        Climbing climbing = new ClimbingImpl();
        climbing.conqueringPeaks(mountain, climber);
//        long removed = climber.stream().filter(d -> d.getStrength() == 0).count();
        long removed = climber.stream().filter(d -> !d.canClimb()).count();

        this.mountainCount++;
        return String.format(ConstantMessages.PEAK_CLIMBING, mountainName, removed);
    }

    @Override
    public String getStatistics() {

        StringBuilder build = new StringBuilder();
        build.append(String.format(ConstantMessages.FINAL_MOUNTAIN_COUNT, this.mountainCount));
        build.append(System.lineSeparator());
        build.append(ConstantMessages.FINAL_CLIMBERS_STATISTICS);

        Collection<Climber> climbers = climberRepository.getCollection();
        for (Climber climber : climbers) {
            build.append(System.lineSeparator());
            build.append(String.format(ConstantMessages.FINAL_CLIMBER_NAME, climber.getName()));
            build.append(System.lineSeparator());
            build.append(String.format(ConstantMessages.FINAL_CLIMBER_STRENGTH, climber.getStrength()));
            build.append(System.lineSeparator());
            if (climber.getRoster().getPeaks().isEmpty()) {
                build.append(String.format(ConstantMessages.FINAL_CLIMBER_PEAKS, "None"));

            } else {
                build.append(String.format(ConstantMessages.FINAL_CLIMBER_PEAKS,
                        String.join(ConstantMessages.FINAL_CLIMBER_FINDINGS_DELIMITER, climber.getRoster().getPeaks())));
            }
        }
        return build.toString();
    }
}
