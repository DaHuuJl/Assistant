package ru.cchgeu.assistant.astcore.util.scheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
    TODO: Класс создан в качестве примера, в будущем он будет не нужен
 */

@Component
@EnableScheduling
public class TestScheduler {

    @Scheduled(cron = "${test.scheduler.first}")
    public void runFirst() {
        //System.out.println("First work!");
    }

    @Scheduled(cron = "${test.scheduler.second}")
    public void runSecond() {
        //System.out.println("Second work!");
    }
}
