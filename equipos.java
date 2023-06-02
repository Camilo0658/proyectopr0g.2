
package com.mycompany.trabajo;

public class equipos {
    private String nomEquipo;
    private String nomEntrenador;
    private String id;


    public equipos() {
    }

    public equipos(String nomEquipo, String nomEntrenador, String id) {
        this.nomEquipo = nomEquipo;
        this.nomEntrenador = nomEntrenador;
        this.id = id;
    }
    

    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public String getNomEntrenador() {
        return nomEntrenador;
    }

    public void setNomEntrenador(String nomEntrenador) {
        this.nomEntrenador = nomEntrenador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    
    
}

