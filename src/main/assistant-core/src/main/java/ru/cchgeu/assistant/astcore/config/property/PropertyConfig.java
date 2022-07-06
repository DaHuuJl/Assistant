package ru.cchgeu.assistant.astcore.config.property;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:cron.properties"),
        @PropertySource(value = "classpath:1c.properties")
})
public class PropertyConfig {

}