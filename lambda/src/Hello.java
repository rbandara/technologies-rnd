import java.util.Arrays;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Hello world " + i);
//                }
//            }
//        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello world " + i);
            }
        }).start();

        //Old way:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n: list) {
            System.out.println(n);
        }

        //New way:
        list.forEach(n -> System.out.println(n));


        //or we can use :: double colon operator in Java 8
        list.forEach(System.out::println);
    }

}


