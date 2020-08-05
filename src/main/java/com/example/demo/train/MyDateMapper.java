package com.example.demo.train;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class MyDateMapper {
    private static final String THE_FORMAT = "YYYY-MM-dd HH:mm";
    private static final DateTimeFormatter DATETIMEFORMATTER = DateTimeFormatter.ofPattern(THE_FORMAT);

    public LocalDateTime asLocalDateTime(String str) {
        return LocalDateTime.parse(str, DATETIMEFORMATTER);
    }

    public String asString(LocalDateTime datetime) {
        return datetime.format(DATETIMEFORMATTER);
    }

}
