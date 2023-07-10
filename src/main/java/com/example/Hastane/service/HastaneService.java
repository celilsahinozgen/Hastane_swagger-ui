package com.example.Hastane.service;

import com.example.Hastane.dto.HastaneRequestDTO;
import com.example.Hastane.dto.HastaneSaveDTO;
import com.example.Hastane.model.Hastane;
import com.example.Hastane.repository.HastaneRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class HastaneService {

    private final HastaneRepository hastaneRepository;
    private final ModelMapper modelMapper;


    public HastaneService(HastaneRepository hastaneRepository, ModelMapper modelMapper) {
        this.hastaneRepository = hastaneRepository;
        this.modelMapper = modelMapper;
    }

    public List<HastaneRequestDTO> findAllHastane() {

        List<Hastane> listHastane = hastaneRepository.findAll();
        List<HastaneRequestDTO> listRequestDto = listHastane.stream()
                .map(hastane -> modelMapper.map(hastane, HastaneRequestDTO.class)).collect(Collectors.toList());
        return listRequestDto;
    }

    public HastaneSaveDTO saveHastane(HastaneSaveDTO newHastane) {
        Hastane hastane = modelMapper.map(newHastane, Hastane.class);

        System.out.println("Service Deneme3 degisdi");
        return modelMapper.map(hastaneRepository.save(hastane), HastaneSaveDTO.class);
    }

}
