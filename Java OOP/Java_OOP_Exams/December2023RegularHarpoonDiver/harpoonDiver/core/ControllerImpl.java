package Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.core;

import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.diver.Diver;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.diving.Diving;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.divingSite.DivingSite;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.common.ConstantMessages;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.common.ExceptionMessages;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.diver.DeepWaterDiver;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.diver.OpenWaterDiver;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.diver.WreckDiver;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.diving.DivingImpl;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.divingSite.DivingSiteImpl;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.repositories.DiverRepository;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.repositories.DivingSiteRepository;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.repositories.Repository;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {

    private Repository<Diver> diverRepository;
    private Repository<DivingSite> divingSiteRepository;
    private int siteCount = 0;

    public ControllerImpl() {
        this.diverRepository = new DiverRepository();
        this.divingSiteRepository = new DivingSiteRepository();
    }

    @Override
    public String addDiver(String kind, String diverName) {
        Diver diver;
        switch (kind) {
            case "OpenWaterDiver":
                diver = new OpenWaterDiver(diverName);
                break;
            case "DeepWaterDiver":
                diver = new DeepWaterDiver(diverName);
                break;
            case "WreckDiver":
                diver = new WreckDiver(diverName);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.DIVER_INVALID_KIND);
        }
        this.diverRepository.add(diver);
        return String.format(ConstantMessages.DIVER_ADDED, kind, diverName);
    }

    @Override
    public String addDivingSite(String siteName, String... seaCreatures) {

        DivingSite site = new DivingSiteImpl(siteName);
        for (String seaCreature : seaCreatures) {
            site.getSeaCreatures().add(seaCreature);
        }
        this.divingSiteRepository.add(site);
        return String.format(ConstantMessages.DIVING_SITE_ADDED, siteName);
    }

    @Override
    public String removeDiver(String diverName) {
        Diver diver = this.diverRepository.byName(diverName);
        if (diver == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.DIVER_DOES_NOT_EXIST, diverName));
        }
        this.diverRepository.remove(diver);

        return String.format(ConstantMessages.DIVER_REMOVE, diverName);
    }

    @Override
    public String startDiving(String siteName) {

        List<Diver> divers = this.diverRepository.getCollection().stream().filter(e -> e.getOxygen() > 30).collect(Collectors.toList());
        if (divers.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.SITE_DIVERS_DOES_NOT_EXISTS);
        }
        DivingSite site = this.divingSiteRepository.byName(siteName);
        Diving diving = new DivingImpl();
        diving.searching(site, divers);
        long removed = divers.stream().filter(d -> d.getOxygen() == 0).count();
        this.siteCount++;
        return String.format(ConstantMessages.SITE_DIVING, siteName, removed);
    }

    @Override
    public String getStatistics() {

        StringBuilder build = new StringBuilder();
        build.append(String.format(ConstantMessages.FINAL_DIVING_SITES, this.siteCount));
        build.append(System.lineSeparator());
        build.append(ConstantMessages.FINAL_DIVERS_STATISTICS);

        Collection<Diver> divers = diverRepository.getCollection();
        for (Diver diver : divers) {
            build.append(System.lineSeparator());
            build.append(String.format(ConstantMessages.FINAL_DIVER_NAME, diver.getName()));
            build.append(System.lineSeparator());
            build.append(String.format(ConstantMessages.FINAL_DIVER_OXYGEN, diver.getOxygen()));
            build.append(System.lineSeparator());
            if (diver.getSeaCatch().getSeaCreatures().isEmpty()) {
                build.append(String.format(ConstantMessages.FINAL_DIVER_CATCH, "None"));

            } else {
                build.append(String.format(ConstantMessages.FINAL_DIVER_CATCH,
                        String.join(ConstantMessages.FINAL_DIVER_CATCH_DELIMITER, diver.getSeaCatch().getSeaCreatures())));
            }
        }
        return build.toString();
    }
}
