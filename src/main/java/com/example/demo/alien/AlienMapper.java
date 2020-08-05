package com.example.demo.alien;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

import com.example.demo.train.MyDateMapper;

@Mapper(uses = { MyDateMapper.class }, componentModel = "spring")
public interface AlienMapper {

    @ValueMapping(source = "CORROSIVE", target = "POINTY")
    @ValueMapping(source = "STICKY", target = "SHORT")
    @ValueMapping(source = "SALTY", target = "FLAT")
    @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "LONG")
    @ValueMapping(source = MappingConstants.NULL, target = "GREASY")
    public FurType from(SlimeType slime);

    @Mapping(source = "slimeType", target = "furtype")
    public FurryAlien from(SlimyAlien slimy);
}
