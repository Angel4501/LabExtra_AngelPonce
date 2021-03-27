package labextra_angelponce;

import java.util.ArrayList;

public class Equipos {
    private String nombre, sloga, paisorigen;
    private int cantidadcampeonatosganados;
    ArrayList jugadores;

    public Equipos() {
    }

    public Equipos(String nombre, String sloga, String paisorigen, 
            int cantidadcampeonatosganados, ArrayList jugadores) {
        this.nombre = nombre;
        this.sloga = sloga;
        this.paisorigen = paisorigen;
        this.cantidadcampeonatosganados = cantidadcampeonatosganados;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSloga() {
        return sloga;
    }

    public void setSloga(String sloga) {
        this.sloga = sloga;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }

    public int getCantidadcampeonatosganados() {
        return cantidadcampeonatosganados;
    }

    public void setCantidadcampeonatosganados(int cantidadcampeonatosganados) {
        this.cantidadcampeonatosganados = cantidadcampeonatosganados;
    }

    public ArrayList getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
