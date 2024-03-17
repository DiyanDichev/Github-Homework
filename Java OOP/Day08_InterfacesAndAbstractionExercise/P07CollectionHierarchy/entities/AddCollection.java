package Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.entities;

import Day08_InterfacesAndAbstractionExercise.P07CollectionHierarchy.interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String item) {
        super.addLast(item);
        return super.getItems().size() - 1;
    }
}
