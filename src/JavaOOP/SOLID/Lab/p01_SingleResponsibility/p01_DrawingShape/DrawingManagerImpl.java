package JavaOOP.SOLID.Lab.p01_SingleResponsibility.p01_DrawingShape;


import JavaOOP.SOLID.Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import JavaOOP.SOLID.Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingRepository;
import JavaOOP.SOLID.Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Renderer;
import JavaOOP.SOLID.Lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {

    private final DrawingRepository drawingRepository;
    private final Renderer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Renderer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        shape.draw(this.renderer, this.drawingRepository);
    }
}
