package com.app.prenotazione.service;

import com.app.prenotazione.model.Hoteles;


import java.util.List;

public interface Hoteles1Service {

    public abstract List<Hoteles> listAllHoteles();

    public  abstract Hoteles addHoteles( Hoteles hoteles);

}
