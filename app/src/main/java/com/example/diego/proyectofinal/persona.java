package com.example.diego.proyectofinal;

/**
 * Created by Diego on 25/12/2016.
 */

public class persona {
    private String nombre;
    private String telefono;
    private String email;
    private String fecha;
    private String descripcion;

    public persona(String nombre, String telefono, String email, String fecha, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
