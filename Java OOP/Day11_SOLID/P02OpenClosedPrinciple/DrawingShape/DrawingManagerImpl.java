package Day11_SOLID.P02OpenClosedPrinciple.DrawingShape;

import Day11_SOLID.P02OpenClosedPrinciple.DrawingShape.interfaces.DrawingManager;
import Day11_SOLID.P02OpenClosedPrinciple.DrawingShape.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {


    @Override
    public void draw(Shape shape) {
        shape.draw(shape);
    }




}
