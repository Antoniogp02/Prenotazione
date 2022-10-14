package com.app.prenotazione.service;

import com.app.prenotazione.model.Login;
import com.app.prenotazione.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public List<Login> getAll(){
        return loginRepository.findAll();
    }

    public boolean Search (Login login){
        List<Login> todoslogins = getAll();
        boolean registrado = false;

        for (int i = 0; i < todoslogins.size(); i++){
            if(todoslogins.get(i).getEmail().equals(login.getEmail()) &&
                    todoslogins.get(i).getContrasenya().equals(login.getContrasenya())){
                registrado=true;
                break;
            }
            else {
                registrado = false;
            }
        }
        return registrado;
    }

    public void registrarLogin(Login login){
        loginRepository.save(login);
    }
}
