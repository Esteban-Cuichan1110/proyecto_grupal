/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberpoo;

/**
 *
 * @author PC
 */
public class Telefono extends Productos {
    private double pulgadas_Pantalla;
    private int bateria_Mah;
    private int camara_Principa_lMp;
    private boolean tiene_5g;
    private boolean Resistente_Agua;

    public Telefono(double pulgadas_Pantalla, int bateria_Mah, int camara_Principa_lMp, boolean tiene_5g, boolean Resistente_Agua, String id_Producto, String marca, String modelo, float precio_base, int stock, String descripcion) {
        super(id_Producto, marca, modelo, precio_base, stock, descripcion);
        this.pulgadas_Pantalla = pulgadas_Pantalla;
        this.bateria_Mah = bateria_Mah;
        this.camara_Principa_lMp = camara_Principa_lMp;
        this.tiene_5g = tiene_5g;
        this.Resistente_Agua = Resistente_Agua;
    }

    public double getPulgadas_Pantalla() {
        return pulgadas_Pantalla;
    }

    public void setPulgadas_Pantalla(double pulgadas_Pantalla) {
        this.pulgadas_Pantalla = pulgadas_Pantalla;
    }

    public int getBateria_Mah() {
        return bateria_Mah;
    }

    public void setBateria_Mah(int bateria_Mah) {
        this.bateria_Mah = bateria_Mah;
    }

    public int getCamara_Principa_lMp() {
        return camara_Principa_lMp;
    }

    public void setCamara_Principa_lMp(int camara_Principa_lMp) {
        this.camara_Principa_lMp = camara_Principa_lMp;
    }

    public boolean isTiene_5g() {
        return tiene_5g;
    }

    public void setTiene_5g(boolean tiene_5g) {
        this.tiene_5g = tiene_5g;
    }

    public boolean isResistente_Agua() {
        return Resistente_Agua;
    }

    public void setResistente_Agua(boolean Resistente_Agua) {
        this.Resistente_Agua = Resistente_Agua;
    }

    
}
