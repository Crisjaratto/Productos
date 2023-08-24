
package productos;


public class producto {
    
    private String Codigo, Nombre; 
    private double ValorUnitario; 
    private int Cantidad; 

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(double ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "producto: " + "Codigo: " + Codigo + ", Nombre: " + Nombre + ", ValorUnitario: " + ValorUnitario + ", Cantidad: " + Cantidad;
    }
    
    
    
}
