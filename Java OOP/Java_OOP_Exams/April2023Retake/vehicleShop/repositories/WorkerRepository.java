package Java_OOP_Exams.April2023Retake.vehicleShop.repositories;

import Java_OOP_Exams.April2023Retake.vehicleShop.models.worker.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkerRepository<T> implements Repository<Worker> {

    private Collection<Worker> workers = new ArrayList<>();

    public void add(Worker worker) {
        this.workers.add(worker);
    }

    public boolean remove(Worker worker) {
        return this.workers.remove(worker);
    }

    @Override
    public Worker findByName(String name) {
        for (Worker worker : workers) {
            if (worker.getName().equals(name)) {
                return worker;
            }
        }
        return null;
    }
    public Collection<Worker> getWorkers(){
        return Collections.unmodifiableCollection(this.workers);
    }
}
