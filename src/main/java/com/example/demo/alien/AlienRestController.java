package com.example.demo.alien;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mapstruct/alien")
@RestController
@RequiredArgsConstructor
public class AlienRestController {
    private final AlienMapper alienMapper;

    @GetMapping("/furry")
    public FurryAlien furry(){
        SlimyAlien slimy = new SlimyAlien("Mike", SlimeType.SMELLY);
        FurryAlien furryAlien = alienMapper.from(slimy);
        return furryAlien;
    }
}
