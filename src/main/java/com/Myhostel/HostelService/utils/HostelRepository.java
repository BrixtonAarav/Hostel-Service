package com.Myhostel.HostelService.utils;

import com.Myhostel.HostelService.model.HostelModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelRepository extends JpaRepository<HostelModel, Integer> {
}
