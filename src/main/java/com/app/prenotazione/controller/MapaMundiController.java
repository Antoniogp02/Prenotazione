/*package com.app.prenotazione.controller;

import com.app.prenotazione.model.MapaMundi;
import com.app.prenotazione.model.Usuario;
import com.app.prenotazione.service.MapaMundiService;
import com.app.prenotazione.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MapaMundiController {

    @Autowired
    private MapaMundiService mapaMundiService;


    @RequestMapping("/mapamundi")
    public List<MapaMundi> obtenenerMapamundi(){
        return mapaMundiService.obternerOrdenadasPorID();
    }



}


 */