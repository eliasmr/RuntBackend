package com.co.runt.controller;

import com.co.runt.dto.PayLoad;
import com.co.runt.env.EndPoint;
import com.co.runt.model.service.IProfesorSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = EndPoint.V_API)
public class ProfesorController {

    @Autowired
    private IProfesorSerivice service;

    @GetMapping(EndPoint.PROFESOR_FIND)
    public PayLoad findAll()
    {
        return service.getProfesor();
    }
}
