package com.example.demo.transportation;

import com.example.demo.alien.SlimyAlien;
import com.example.demo.train.Train;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HoverScooterMapper {
    @Mapping(target="model", expression="java(train.getModel() + \"_\" + alien.getClass().getSimpleName())")
    @Mapping(source="alien.fullname", target="madeforalien")
    @Mapping(source="train.maxSpeed", target="maxSpeed")
    public HoverScooter scooter(SlimyAlien alien, Train train);
}
