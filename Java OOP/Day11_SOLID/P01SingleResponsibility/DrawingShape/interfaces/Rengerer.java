package Day11_SOLID.P01SingleResponsibility.DrawingShape.interfaces;

public interface Rengerer {
    void render(DrawingRepository drawingRepository, Shape shape);
}
