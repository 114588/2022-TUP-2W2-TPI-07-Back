package main.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_producto")
    private Producto producto;

    @Column(nullable = false)
    private double precio_unitario;

    @Column(nullable = false)
    private int cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_oferta")
    private Oferta oferta;

<<<<<<< HEAD
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fatura")
    private Factura factura;

    public DetalleFactura() {
    }

    public DetalleFactura(int id, Producto producto, double precio_unitario, int cantidad, Oferta oferta, Factura factura) {
=======
    public DetalleFactura() {
    }

    public DetalleFactura(int id, Producto producto, double precio_unitario, int cantidad, Oferta oferta) {
>>>>>>> cad2137c5db568840f96129bccfffa433623ea5a
        this.id = id;
        this.producto = producto;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.oferta = oferta;
<<<<<<< HEAD
        this.factura = factura;
=======
>>>>>>> cad2137c5db568840f96129bccfffa433623ea5a
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

<<<<<<< HEAD
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

=======
>>>>>>> cad2137c5db568840f96129bccfffa433623ea5a
    private static final long serialVersionUID = 1L;
}
