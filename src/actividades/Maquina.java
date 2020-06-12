
package actividades;

/**
 *
 * @author Alexis
 */
public class Maquina {
    //Creacion de Atributos
    private String modelo;
    private double costoPorDia;

    //Constructor vacio(no es necesario, ya que lo crea por defecto)
    public Maquina() {
    }

    //Creacion Metodos get y set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCostoPorDia() {
        return costoPorDia;
    }

    public void setCostoPorDia(Double costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    //Convierte el objeto a Cadena
    @Override
    public String toString() {
        return "" + "\n \tModelo:" + modelo + "\n \tCostoPorDia:" + costoPorDia;
    }
    
    
}
