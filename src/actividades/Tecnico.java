
package actividades;

/**
 *
 * @author Alexis
 */
public class Tecnico {
    
    //Declaracion de Atributos de la clase Tecnico
    private String identificador;
    private Double pagoPorDia;

    //Constructor de Tecnico
    public Tecnico() {
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Double getPagoPorDia() {
        return pagoPorDia;
    }

    public void setPagoPorDia(Double pagoPorDia) {
        this.pagoPorDia = pagoPorDia;
    }

    //Convierte el objeto a Cadena
    @Override
    public String toString() {
        return "" + "\n \tIdentificador:" + identificador + "\n \tPago Por Dia:" + pagoPorDia;
    }

    

    
       
}
