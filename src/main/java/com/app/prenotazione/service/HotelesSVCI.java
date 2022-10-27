package com.app.prenotazione.service;

import com.app.prenotazione.model.Hoteles;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.repository.HotelesRIP;
import com.app.prenotazione.repository.HotelesSVC;
import com.app.prenotazione.repository.UsuarioRIP;
import com.app.prenotazione.repository.UsuarioSVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("hotelesSVC")
public class HotelesSVCI implements HotelesSVC {

    @Qualifier("hotelesRIP")
    @Autowired
    private HotelesRIP hotelesRIP;

    @Override
    public List<Hoteles> listAllHoteles() {
        return hotelesRIP.findAll();
    }

    @Override
    public Hoteles addHoteles(Hoteles hoteles) {
        return hotelesRIP.save(hoteles);
    }
}
