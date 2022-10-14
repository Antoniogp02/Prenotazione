package com.app.prenotazione.controller;

import com.app.prenotazione.model.*;
import com.app.prenotazione.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private HotelesService hotelesService;

    @Autowired
    private TransporteService transporteService;

    @Autowired
    private MapaMundiService mapaMundiService;

    @RequestMapping("/reservas")
    public List<Reserva> obtenerReservas(){
        return reservaService.obtenerReservas();
    }

    @GetMapping("/reservas/nueva")
    public ModelAndView nuevaReserva(){
        ModelAndView model = new ModelAndView("nuevaReserva");
        Reserva reserva = new Reserva();
        List<Usuario> usuarios = usuarioService.getAll();
        List<Hoteles> hoteles = hotelesService.getAll();
        List<Transporte> transportes = transporteService.getAll();
        List<MapaMundi> mapaMundis = mapaMundiService.getAll();
        model.addObject("reserva", reserva);
        model.addObject("listaUsuarios", usuarios);
        model.addObject("listaHoteles", hoteles);
        model.addObject("listaTransportes", transportes);
        model.addObject("listaMapamundis", mapaMundis);
        return model;
    }

    @PostMapping("/reservas/guardar")
    public void guardarReserva( @RequestBody @ModelAttribute("reervas") Reserva reserva){
        reservaService.guardarReserva(reserva);
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestBody Integer id){
        reservaService.eliminar(id);
        return "Reserva eliminada correctamente";
    }

}
