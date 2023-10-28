
package Modelo;


public class Persona {
    int id;
    String nombre;
    String score;

    public Persona() {
    }

    public Persona(String nombre, String score) {
        this.nombre = nombre;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    
}
