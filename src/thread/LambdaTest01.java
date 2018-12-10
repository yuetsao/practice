package thread;

public class LambdaTest01 {
    static class Like2 implements ILike {

        @Override
        public void lambda() {
            System.out.println("I like lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like2();
        like.lambda();
        like = new Like();
        like.lambda();

        class Like3 implements ILike {

            @Override
            public void lambda() {
                System.out.println("I like labmda3");
            }
        }
        like = new Like3();
        like.lambda();
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4");
            }
        };
        like.lambda();
        like = ()->{
            System.out.println("I like lambda5");
        };
        like.lambda();
    }




}

interface ILike {
    void lambda();
}

class Like implements ILike {

    @Override
    public void lambda() {
        System.out.println("I like lambda1");
    }
}