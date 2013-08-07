package ftp27.parametrised;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: acherepanov
 * Date: 8/7/13
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Temps {
    static String LOW="low", NORMAL="normal", HIGH="high";
    public static final int Rabbit=1, Pigeon=2, Human=3;
    public Double low, high;

    public Temps (int patient) {

        switch(patient) {
            case Rabbit:  // rabbit 38,5-39,5
                low = 38.5;
                high = 39.5;
                break;
            case Pigeon:  // pigeon 41,0-43,0
                low = 41.0;
                high = 43.0;
                break;
            case Human: // human 35,5-37,4
                low = 35.5;
                high = 37.5;
                break;
            default:
                low = 0.0;
                high = 0.0;
                break;
        }
    }

    public String checkOutTemp(Double temp) {
        if (temp < low) {
            return LOW;
        } else if (temp > high) {
            return HIGH;
        } else {
            return NORMAL;
        }
    }
}
