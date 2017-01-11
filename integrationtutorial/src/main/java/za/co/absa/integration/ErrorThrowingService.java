package za.co.absa.integration;

import java.util.Random;

/**
 * Created by aminggs on 2017/01/11.
 */
public class ErrorThrowingService {

    private Random random = new Random();

    public String highlight(String s) {
        if (random.nextBoolean()) {
            System.out.println("Exception coming");
            throw new RuntimeException("Error from service");
        }
        System.out.println(s);
        return ">>>>>" + s + "<<<<<";
    }

    public void echo(String s) {
        System.out.println("Echoing this message: " + s);
    }

}