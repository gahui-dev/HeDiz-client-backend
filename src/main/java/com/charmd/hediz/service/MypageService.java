package com.charmd.hediz.service;

import com.charmd.hediz.dto.CustomerDTO;
import com.charmd.hediz.dto.ReservationDTO;

import java.util.List;

public interface MypageService {
    public CustomerDTO findMypage(CustomerDTO customerDto);
    public List<ReservationDTO> reservation(ReservationDTO reservationDto);
    public int updateMypage(CustomerDTO customerDto);
}