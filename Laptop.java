/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberpoo;

/**
 *
 * @author PC
 */
public class Laptop extends Productos {
  private String procesador;
    private int memoria_ram;
    private String almacenamiento;
    private String sistema_operativo;
    private String tipo_teclado;

    public Laptop(String procesador, int memoria_ram, String almacenamiento, String sistema_operativo, String tipo_teclado, String id_Producto, String marca, String modelo, float precio_base, int stock, String descripcion) {
        super(id_Producto, marca, modelo, precio_base, stock, descripcion);
        this.procesador = procesador;
        this.memoria_ram = memoria_ram;
   
        this.almacenamiento = almacenamiento;
        this.sistema_operativo = sistema_operativo;
        this.tipo_teclado = tipo_teclado;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

   
    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getTipo_teclado() {
        return tipo_teclado;
    }

    public void setTipo_teclado(String tipo_teclado) {
        this.tipo_teclado = tipo_teclado;
    }
  
   
    
}
