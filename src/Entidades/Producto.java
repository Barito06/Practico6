package Entidades;
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion; 
    private double precio;
    private Rubro rubro;
    private int stock;
    
    //constructor
    public Producto(int codigo, String descripcion, double precio, Rubro rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }
    public Producto() {
    }
    
    //getters y setters

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Rubro getRubro() {
        return rubro;
    }
    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto p) {
        //devuelve 0 si son iguales, 1 si el producto de la clase producto es mayor y -1 si es menor
        if (this.getCodigo() == p.getCodigo()) {
            return 0;
        } else if(this.getCodigo() > p.getCodigo()){
                return 1;
        }else{
        return -1;
        }
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock;
    }
    
    
}
