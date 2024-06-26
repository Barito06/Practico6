package Entidades;

import java.util.Objects;

public class Rubro {
  private int codigo;
  private String nombre;  
  //constructos de clase Rubro.
    public Rubro() {
    }
    public Rubro(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
  //getters y setters clase Rubro.
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Rubro other = (Rubro) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
  
  
}
