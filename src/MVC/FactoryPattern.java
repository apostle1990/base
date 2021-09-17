package MVC;

interface Shap{
    void draw();
}

class Rectangle implements Shap{
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements Shap{
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
class Circle implements Shap{
    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}

class ShapeFactory{
    public Shap getShap(String shapeType){
        switch (shapeType){
            case "Circle": return new Circle();
            case "Rectangle": return new Rectangle();
            case "Square": return new Square();
            default: return null;
        }
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shap shap1 = shapeFactory.getShap("Circle");
        shap1.draw();

        Shap shap2 = shapeFactory.getShap("Rectangle");
        shap2.draw();

        Shap shap3 = shapeFactory.getShap("Square");
        shap3.draw();
    }
}
