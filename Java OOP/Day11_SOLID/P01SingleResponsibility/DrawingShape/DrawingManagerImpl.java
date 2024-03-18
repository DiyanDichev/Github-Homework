package Day11_SOLID.P01SingleResponsibility.DrawingShape;

import Day11_SOLID.P01SingleResponsibility.DrawingShape.interfaces.DrawingManager;
import Day11_SOLID.P01SingleResponsibility.DrawingShape.interfaces.DrawingRepository;
import Day11_SOLID.P01SingleResponsibility.DrawingShape.interfaces.Rengerer;
import Day11_SOLID.P01SingleResponsibility.DrawingShape.interfaces.Shape;


public class DrawingManagerImpl implements DrawingManager {

    private final DrawingRepository drawingRepository;
    private final Rengerer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Rengerer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        shape.draw(this.renderer, this.drawingRepository);
    }
}
