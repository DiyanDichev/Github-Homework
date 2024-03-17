package Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.entities;

import Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.interfaces.AddRemovable;
import Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.interfaces.Addable;

public class AddRemoveCollection extends Collection implements AddRemovable, Addable {
    @Override
    public String remove() {
        return super.removeLast();
    }

    @Override
    public int add(String item) {
        super.addFirst(item);
        return 0;
    }
}
