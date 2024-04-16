package tp6;

import Entidades.*;
import java.util.TreeSet;

public class mainSecundario {
    public static void main(String[] args){
    
    TreeSet<Producto> productos = new TreeSet<>();
    Rubro comestible = new Rubro(1, "comestible");
    Producto arroz = new Producto(2, "arroz gallo", 500, comestible, 25);
    Producto cafe = new Producto(1, "Cafe Torrado", 3000, comestible, 60);

    
    
    productos.add(arroz);
    productos.add(cafe);
    
        for (Producto producto : productos) {
            System.out.println(producto);
        }

    
    }
}
