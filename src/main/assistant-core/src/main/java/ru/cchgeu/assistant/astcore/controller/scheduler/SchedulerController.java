package ru.cchgeu.assistant.astcore.controller.scheduler;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/scheduler", produces = {MediaType.APPLICATION_JSON_VALUE})
public class SchedulerController {

}
