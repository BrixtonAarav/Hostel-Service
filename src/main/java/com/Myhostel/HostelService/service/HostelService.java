package com.Myhostel.HostelService.service;

import com.Myhostel.HostelService.model.HostelModel;

import java.util.List;

public interface HostelService {

    //create
    HostelModel createHostel(HostelModel hostelModel);

    //get All
    List<HostelModel> getAllHostel();

    //get Single
    HostelModel getHostelByID(int hostelId);
}
