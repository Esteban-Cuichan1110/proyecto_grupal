/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberpoo;

/**
 *
 * @author PC
 */
public class Productos {
    private String id_Producto;
    private String marca;
    private String modelo;
   private float precio_base;
   private int stock;
   private String descripcion;

    public Productos(String id_Producto, String marca, String modelo, float precio_base, int stock, String descripcion) {
        this.id_Producto = id_Producto;
        this.marca = marca;
        this.modelo = modelo;
        this.precio_base = precio_base;
        this.stock = stock;
        this.descripcion = descripcion;
    }

    public String getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(String id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}
