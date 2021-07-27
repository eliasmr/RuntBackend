package com.co.runt.model.service.impl;

import com.co.runt.dto.PayLoad;
import com.co.runt.model.repository.ProfesorRepository;
import com.co.runt.model.service.IProfesorSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

@Service
public class ProfesorImpl implements IProfesorSerivice {

    Logger logger = Logger.getLogger("ProfesorImpl");

    @Autowired
    @Qualifier("profesorRepository")
    private ProfesorRepository repository;

    private AtomicReference<PayLoad> response= new AtomicReference<>();
    @Override
    public PayLoad getProfesor() {
        logger.info("findAll getProfesor::ProfesorImpl::getProfesor::25");
        try {
            response.set(new PayLoad(HttpStatus.OK, "OK", repository.findAll(), "success"));
        } catch (Exception ex) {
            response.set(new PayLoad(HttpStatus.CONFLICT, "Error", ex.getMessage(), "Error al Consultar el profesor"));
        }

        return response.get();
    }
}
