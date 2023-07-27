public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setColor("Green");
        circle.setRadius(30);

        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
        System.out.println("Circumference = " + circle.getCircumference());
        System.out.println("Color = " + circle.getColor());
        System.out.println("toString: " + circle.toString());
    }
}
