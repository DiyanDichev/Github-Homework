package Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.repositories;

import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.divingSite.DivingSite;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class DivingSiteRepository implements Repository<DivingSite> {

    private final Map<String, DivingSite> sites;

    public DivingSiteRepository() {
        this.sites = new LinkedHashMap<>();
    }

    @Override
    public Collection<DivingSite> getCollection() {
        return Collections.unmodifiableCollection(this.sites.values());
    }

    @Override
    public void add(DivingSite site) {
        sites.put(site.getName(), site);
    }

    @Override
    public boolean remove(DivingSite site) {
        return sites.remove(site.getName()) != null;
    }

    @Override
    public DivingSite byName(String name) {
        return sites.get(name);
    }
}
