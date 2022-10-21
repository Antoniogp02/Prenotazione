package com.app.prenotazione.service;

import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.repository.Hoteles1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("hoteles1Service")
public class Hoteles1ServiceImport implements Hoteles1Service {


    @Qualifier("hoteles1Repository")
    @Autowired
    private Hoteles1Repository hoteles1Repository;

    @Override
    public List<Hoteles> listAllHoteles() {
        return hoteles1Repository.findAll();
    }

    @Override
    public Hoteles addHoteles(Hoteles hoteles) {
        return hoteles1Repository.save(hoteles);
    }
}
