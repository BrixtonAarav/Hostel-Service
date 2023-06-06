package com.Myhostel.HostelService.service;

import com.Myhostel.HostelService.model.HostelModel;
import com.Myhostel.HostelService.utils.HostelRepository;
import com.Myhostel.HostelService.utils.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HostelServiceImpl implements HostelService{

    @Autowired
    private HostelRepository hostelRepository;

    @Override
    public HostelModel createHostel(HostelModel hostelModel) {

        return hostelRepository.save(hostelModel);
    }

    @Override
    public List<HostelModel> getAllHostel() {
        return hostelRepository.findAll();
    }

    @Override
    public HostelModel getHostelByID(int hostelId) {
        return hostelRepository.findById(hostelId).orElseThrow(() -> new ResourceNotFoundException("Hostel With Given Id is not found."));
    }
}
