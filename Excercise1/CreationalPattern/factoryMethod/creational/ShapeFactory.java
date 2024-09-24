package creational;

public class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            throw new IllegalArgumentException("Shape type cannot be null");
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
