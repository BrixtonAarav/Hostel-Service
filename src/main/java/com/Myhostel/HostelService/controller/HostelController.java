package com.Myhostel.HostelService.controller;

import com.Myhostel.HostelService.model.HostelModel;
import com.Myhostel.HostelService.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hostel")
public class HostelController {

    @Autowired
    private HostelService hostelService;

    @PostMapping("/new")
    public ResponseEntity<HostelModel> createNewHostel(@RequestBody HostelModel hostelModel){
        HostelModel hostel = hostelService.createHostel(hostelModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hostel);
    }

    @GetMapping("/all")
    public ResponseEntity<List<HostelModel>> getAllHostel(){
        List<HostelModel> hostelList = hostelService.getAllHostel();
        return ResponseEntity.ok(hostelList);
    }


    @GetMapping("/{id}")
    public ResponseEntity<HostelModel> getHostelById(@PathVariable  int id){
        HostelModel hostel = hostelService.getHostelByID(id);
        return ResponseEntity.status(HttpStatus.OK).body(hostel);
    }

}
