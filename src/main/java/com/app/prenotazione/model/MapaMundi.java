package com.app.prenotazione.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mapamundi")
public class MapaMundi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String continente;
    private String paises;
    private String ciudades;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    public String getCiudades() {
        return ciudades;
    }

    public void setCiudades(String ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapaMundi mapaMundi = (MapaMundi) o;
        return id == mapaMundi.id && Objects.equals(continente, mapaMundi.continente) && Objects.equals(paises, mapaMundi.paises) && Objects.equals(ciudades, mapaMundi.ciudades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, continente, paises, ciudades);
    }


    @Override
    public String toString() {
        return "MapaMundi{" +
                "id=" + id +
                ", continente='" + continente + '\'' +
                ", paises='" + paises + '\'' +
                ", ciudades='" + ciudades + '\'' +
                '}';
    }
}
