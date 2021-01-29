package factoryPattern;

public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape (String shapeType){
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        Shape square = shapeFactory.getShape("square");
        circle.draw();
        square.draw();
    }
}
