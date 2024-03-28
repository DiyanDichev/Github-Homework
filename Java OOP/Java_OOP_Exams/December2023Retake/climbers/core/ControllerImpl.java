package Java_OOP_Exams.December2023Retake.climbers.core;

import Java_OOP_Exams.December2023Retake.climbers.common.ConstantMessages;
import Java_OOP_Exams.December2023Retake.climbers.common.ExceptionMessages;
import Java_OOP_Exams.December2023Retake.climbers.models.climber.Climber;
import Java_OOP_Exams.December2023Retake.climbers.models.climbing.Climbing;
import Java_OOP_Exams.December2023Retake.climbers.models.climbing.ClimbingImpl;
import Java_OOP_Exams.December2023Retake.climbers.models.mountain.Mountain;
import Java_OOP_Exams.December2023Retake.climbers.repositories.ClimberRepository;
import Java_OOP_Exams.December2023Retake.climbers.repositories.MountainRepository;
import Java_OOP_Exams.December2023Retake.climbers.repositories.Repository;
import Java_OOP_Exams.December2023Retake.climbers.models.climber.RockClimber;
import Java_OOP_Exams.December2023Retake.climbers.models.climber.WallClimber;
import Java_OOP_Exams.December2023Retake.climbers.models.mountain.MountainImpl;

import java.util.Collection;

public class ControllerImpl implements Controller {

    private final Repository<Mountain> mountainRepository;
    private final Repository<Climber> climberRepository;
    private int mountains;

    public ControllerImpl() {
        this.mountainRepository = new MountainRepository();
        this.climberRepository = new ClimberRepository();
    }


    @Override
    public String addClimber(String type, String climberName) {

        Climber climber;
        switch (type) {
            case "WallClimber":
                climber = new WallClimber(climberName);
                break;
            case "RockClimber":
                climber = new RockClimber(climberName);
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
        for (String peak : peaks) {
            mountain.getPeaksList().add(peak);
        }
        this.mountainRepository.add(mountain);
        return String.format(ConstantMessages.MOUNTAIN_ADDED, mountainName);

    }

    @Override
    public String removeClimber(String climberName) {
        Climber climber = this.climberRepository.byName(climberName);

        if (climber == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.CLIMBER_DOES_NOT_EXIST, climberName));
        }
        climberRepository.remove(climber);

        return String.format(ConstantMessages.CLIMBER_REMOVE, climberName);
    }

    @Override
    public String startClimbing(String mountainName) {

        Collection<Climber> climbers = this.climberRepository.getCollection();

        if (climbers.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.THERE_ARE_NO_CLIMBERS);
        }
        Mountain mountain = this.mountainRepository.byName(mountainName);
        Climbing climbing = new ClimbingImpl();
        climbing.conqueringPeaks(mountain, climbers);
        long removed = climbers.stream().filter(d -> d.getStrength() == 0).count();
        this.mountains++;
        return String.format(ConstantMessages.PEAK_CLIMBING, mountainName, removed);
    }

    @Override
    public String getStatistics() {
        StringBuilder build = new StringBuilder();
        build.append(String.format(ConstantMessages.FINAL_MOUNTAIN_COUNT, this.mountains));
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
