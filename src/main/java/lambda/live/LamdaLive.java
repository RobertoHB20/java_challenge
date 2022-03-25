package lambda.live;

public class LamdaLive {

    public static void main(String[] args) {
        new Thread(new PrintHello()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 2");
            }
        }).start();

        new Thread(() -> System.out.println("Hello world 3")).start();

    }
}

class PrintHello implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello world 1");
    }
}
