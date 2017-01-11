package za.co.absa.integration;

import java.util.Random;

/**
 * Created by aminggs on 2017/01/11.
 */
public class ErrorThrowingService {

    private Random random = new Random();

    public String highlight(String s) {
        if (random.nextBoolean()) {
            throw new RuntimeException("Error from service");
        }

        return ">>>>>" + s + "<<<<<";
    }

    public void echo(String s) {
        System.out.println("Echoing this message: " + s);
    }

}