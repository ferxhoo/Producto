/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author HP
 */
public class Accesorio extends Producto{
    
    private String detalle;

    public Accesorio(String detalle, String referencia, String descripcion, String estado, String categoria) {
        super(referencia, descripcion, estado, categoria);
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    @Override
    public String toString() {

       return String.format("%15s %20s %24s %15s %35s\n",
                            this.getReferencia(),
                            this.getDescripcion(),
                            this.getEstado(),
                            this.getCategoria(),
                            this.getDetalle());
    }
    /*
    @Override
    public String infoProducto(){
        return String.format("%-20s: %s\n", 
                             "Detalle", this.detalle); 
    }
*/
}
