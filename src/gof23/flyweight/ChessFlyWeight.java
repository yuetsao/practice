package gof23.flyweight;

//享元类
public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate coordinate);

}

class ConcreteChess implements ChessFlyWeight {
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色" + color);
        System.out.println("棋子位置" + coordinate.getX()+"----"+ coordinate.getY());
    }
}
