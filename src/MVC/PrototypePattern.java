package MVC;

import java.util.Hashtable;

public class PrototypePattern {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}

abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}

class RectangleP extends Shape{
    public RectangleP(){
        type = "Rectange";
    }

    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
class CircleP extends Shape{
    public CircleP(){
        type = "Circle";
    }

    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}
class SquareP extends Shape{
    public SquareP(){
        type = "Square";
    }

    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}

class ShapeCache{
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    public static void loadCache(){
        CircleP circle = new CircleP();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        SquareP square = new SquareP();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        RectangleP rectangle = new RectangleP();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}