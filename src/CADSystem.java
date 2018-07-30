
class Shape {
    Shape(int i) {
        System.out.println("shape constructor");
    }
    void dispose() {
        System.out.println("shape dispose");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("circle constructor");
    }
    void dispose() {
        System.out.println("circle dispose");
        super.dispose();
    }
}

class Triange extends Shape {
    Triange(int i) {
        super(i);
        System.out.println("Triange constructor");
    }
    void dispose() {
        System.out.println("Triange dispose");
        super.dispose();
    }

}

class Line extends  Shape {
    Line(int i) {
        super(i);
        System.out.println("Line constructor");
    }
    void dispose() {
        System.out.println("Line dispose");
        super.dispose();
    }
}

public class CADSystem extends Shape {
    CADSystem(int i) {
        super(i);
        System.out.println("CADSystem constructor");
    }
    void dispose() {
        System.out.println("CADSystem dispose");
        super.dispose();
    }
}
