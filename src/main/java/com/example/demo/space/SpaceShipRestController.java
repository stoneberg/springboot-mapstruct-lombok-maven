package com.example.demo.space;

import com.example.demo.cargo.Fruit;
import com.example.demo.train.Train;
import com.example.demo.train.TrainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequestMapping("/mapstruct/spaceship")
@RestController
@RequiredArgsConstructor
public class SpaceShipRestController {
    private final TrainMapper trainMapper;

    @GetMapping
    public SpaceShip spaceShip() {
        Train train = new Train("T800", 2500.0f, LocalDateTime.now());
        Fruit fruit = new Fruit("Bananas", 100);
        return trainMapper.trainToSpaceShip(train, fruit);
    }
}
