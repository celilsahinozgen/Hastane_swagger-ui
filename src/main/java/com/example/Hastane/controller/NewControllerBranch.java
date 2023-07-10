package com.example.Hastane.controller;

import com.example.Hastane.dto.HastaneRequestDTO;
import com.example.Hastane.service.HastaneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api1/hastane")

public class NewControllerBranch {

    private final HastaneService hastaneService;

    public NewControllerBranch(HastaneService hastaneService) {
        this.hastaneService = hastaneService;
    }

    @GetMapping(name = "/findAll")
    public ResponseEntity<List<HastaneRequestDTO>> findAllHastane(){
        List<HastaneRequestDTO> listHastane = hastaneService.findAllHastane();
        System.out.println("deneme3Branch");
        return ResponseEntity.ok(listHastane);
    }
}
