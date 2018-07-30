package polymophism;

public class Shapes {
    private static RandShapeGenerator randShapeGenerator = new RandShapeGenerator();
    public static void main(String [] args) {
        Shape[]  s = new Shape[9];
        for(int i=0; i<s.length; i++) {
            s[i] = randShapeGenerator.next();
        }
        for(Shape shape: s) {
            shape.draw();
        }
    }
}
