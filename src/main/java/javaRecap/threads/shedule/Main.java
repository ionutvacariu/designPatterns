package javaRecap.threads.shedule;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(new Thread(), 0, getDuration(0).getSeconds(), TimeUnit.SECONDS);
    }

    private static Duration getDuration(int minutesAfterMidnight) {
        LocalDateTime localNow = LocalDateTime.now();
        ZoneId currentZone = ZoneId.systemDefault();
        ZonedDateTime zonedNow = ZonedDateTime.of(localNow, currentZone);

        ZonedDateTime zonedNextMidnight = zonedNow.withHour(17).withMinute(40).withSecond(0).plusDays(1);

        return Duration.between(zonedNow, zonedNextMidnight);
    }

}
