package com.co.runt.model.service;

import com.co.runt.dto.ClienteDTO;
import com.co.runt.dto.PayLoad;

public interface IClienteService {

    PayLoad save(ClienteDTO dto);
    PayLoad update(ClienteDTO dto);
    PayLoad findAll();
    PayLoad findById(String sharedkey);
    PayLoad deleteById(String sharedkey);
}
