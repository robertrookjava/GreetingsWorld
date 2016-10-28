import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 * Created by Peaq on 26-10-2016.
 */
public class Greetings {
    public static void main(String[] args) {
        int x = intValue(Math.random() * 10);
        System.out.println(x);
        switch (x) {
            case 1:
                System.out.println("Greetings Earthlings, resistance is futile");
                break;
            case 2:
                System.out.println("We come in peace, shoot to kill.");
                break;
            case 3:
                System.out.println("Tim Burton rocks.");
                break;
            default:
                System.out.println("Hope you brought a towel");
                break;
        }
    }
}
