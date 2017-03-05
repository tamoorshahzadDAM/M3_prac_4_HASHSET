/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_uf5_m3_hashset;

import java.util.Objects;

/**
 *
 * @author Tamoor
 */
public class Libros {

    int id_libro;
    String nombre;
    String autor;
    String editor;
    int cantidad;

    public Libros(int id_libro, String nombre, String autor, String editor, int cantidad) {
        this.id_libro = id_libro;
        this.nombre = nombre;
        this.autor = autor;
        this.editor = editor;
        this.cantidad = cantidad;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {

        int hash = Objects.hashCode(this.nombre);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libros other = (Libros) obj;
        if (this.id_libro != other.id_libro) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libros{" + "id_libro=" + id_libro + ", nombre=" + nombre + ", autor=" + autor + ", editor=" + editor + ", cantidad=" + cantidad + "}," + "\n";
    }

}
