package com.app.prenotazione.repository;

import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Usuario;

import java.util.List;

public interface HotelesSVC {

    public abstract List<Hoteles> listAllHoteles();

    public abstract Hoteles addHoteles(Hoteles hoteles);

}
