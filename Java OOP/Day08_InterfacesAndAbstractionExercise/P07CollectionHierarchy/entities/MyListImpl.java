package Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.entities;

import Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.interfaces.AddRemovable;
import Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.interfaces.Addable;
import Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.interfaces.MyList;

public class MyListImpl extends Collection implements Addable, AddRemovable, MyList {

    @Override
    public String remove() {
        return super.removeFirst();
    }

    @Override
    public int add(String item) {
        super.addFirst(item);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
