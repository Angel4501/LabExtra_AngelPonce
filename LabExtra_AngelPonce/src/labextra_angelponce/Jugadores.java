package labextra_angelponce;

public class Jugadores {
    
    private String nombre, apellido, nacionalidad, edad, sexo, cantdidadbalonesdeoro,cantidadmedallas,atleta;//atleta si o no

    public Jugadores() {
    }

    public Jugadores(String nombre, String apellido, String nacionalidad, 
            String edad, String sexo, String cantdidadbalonesdeoro, String cantidadmedallas, String atleta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
        this.cantdidadbalonesdeoro = cantdidadbalonesdeoro;
        this.cantidadmedallas = cantidadmedallas;
        this.atleta = atleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCantdidadbalonesdeoro() {
        return cantdidadbalonesdeoro;
    }

    public void setCantdidadbalonesdeoro(String cantdidadbalonesdeoro) {
        this.cantdidadbalonesdeoro = cantdidadbalonesdeoro;
    }

    public String getCantidadmedallas() {
        return cantidadmedallas;
    }

    public void setCantidadmedallas(String cantidadmedallas) {
        this.cantidadmedallas = cantidadmedallas;
    }

    public String getAtleta() {
        return atleta;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}


