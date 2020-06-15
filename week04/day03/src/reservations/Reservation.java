package reservations;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Random;

public class Reservation implements Reservationy {

    String reservationCode;
    String reservationDay;


    public Reservation() {

        //random 3 char day
        String[] randomDay = new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        int idx = new Random().nextInt(randomDay.length);
        String random = (randomDay[idx]);
        this.reservationDay = random.substring(0, 3).toUpperCase();

        //random 8 char code A-Z
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random randomCode = new Random();
        String generatedString = randomCode.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        this.reservationCode = generatedString.toUpperCase();
    }


    @Override
    public String getDowBooking() {
        return reservationDay;
    }

    @Override
    public String getCodeBooking() {
        return reservationCode;
    }
}

