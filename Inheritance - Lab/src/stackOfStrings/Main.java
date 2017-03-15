package stackOfStrings;

/**
 * Created by Magdalena on 16.3.2017 г..
 */
public class Main {
    public static void main(String[] args) {
        StackOfStrings sos = new StackOfStrings();
        sos.push("gosho");
        sos.push("pesho");
        sos.push("mimi");

        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());

    }
}
