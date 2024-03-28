package Day11_SOLID.P05DependencyInversion._02Worker;

public class Manager {

    public Manager() {
        Worker worker = new Worker();
        worker.work();
    }
}
