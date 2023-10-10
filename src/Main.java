import com.André.Javab.lektion1.Counter;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Counter A");
            Counter.count();

            System.out.println("Counter B");
            Counter.count();

        }


    }
}