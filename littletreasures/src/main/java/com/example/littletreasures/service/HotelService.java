package com.example.littletreasures.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.littletreasures.entity.Hotel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class HotelService {
    private final ObjectMapper objectMapper;

    public HotelService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }


    public List<Hotel> loadJsonDataFromFile() throws IOException {
        // Specify the file path
        String filePath = "/Users/hasanain/Desktop/GitHub/demo-load-yml-data/littletreasures/src/main/resources/hotels.yml";
        return objectMapper.readValue(objectMapper.readTree(new File(filePath)).get("treasures").get("hotels").toString(),new TypeReference<List<Hotel>>() {});
    }
    
    
}
