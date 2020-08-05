package com.example.demo.transportation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HoverScooterRestControllerTest {
    
    private static final Logger log = LoggerFactory.getLogger(HoverScooterRestControllerTest.class);
    
    @Autowired
    HoverScooterRestController hoverScooterRestController;

    @Test
    @DisplayName("두개의 객체를 조합하여 결과를 도출")
    void get_scooter_test() {
        HoverScooter scooter = hoverScooterRestController.scooter();
        log.info("@scooter===========>{}", scooter);
        assertThat(scooter.getMadeforalien()).isEqualTo("Mike");
        assertThat(scooter.getMaxSpeed()).isEqualTo(2500.0d);
        assertThat(scooter.getModel()).isEqualTo("T800_SlimyAlien");
    }
}