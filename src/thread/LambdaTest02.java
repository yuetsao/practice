package thread;

public class LambdaTest02 {
    public static void main(String[] args) {
        ILove iLove = (int a)-> {
            System.out.println("I love lambda" + a);
        };
        iLove.lambda(1);
        iLove = (a) -> {
            System.out.println("I love lambda" + a);
        };
        iLove.lambda(2);
        iLove = a -> {
            System.out.println("I love lambda" + a);
        };
        iLove.lambda(3);
        iLove = a-> System.out.println("I love lambda" + a);
        iLove.lambda(4);
    }


}

interface ILove {
    void lambda(int a);
}

//class Love implements ILove {
//
//    @Override
//    public void lambda(int a) {
//        System.out.println("I love lambda" + a);
//    }
//}
