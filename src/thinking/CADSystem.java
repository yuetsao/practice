package thinking;

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
        System.out.println("thinking.Triange constructor");
    }
    void dispose() {
        System.out.println("thinking.Triange dispose");
        super.dispose();
    }

}

class Line extends  Shape {
    Line(int i) {
        super(i);
        System.out.println("thinking.Line constructor");
    }
    void dispose() {
        System.out.println("thinking.Line dispose");
        super.dispose();
    }
}

public class CADSystem extends Shape {
    CADSystem(int i) {
        super(i);
        System.out.println("thinking.CADSystem constructor");
    }
    void dispose() {
        System.out.println("thinking.CADSystem dispose");
        super.dispose();
    }
}
