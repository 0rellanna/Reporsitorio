    
package actividades;

/**
 *
 * @author Alexis
 */
public class Actividad {
    
    //Declaracion de Atributos
   private String nombre;
   private double duracionEnDias;
   private static int cantidadDeActividades=0;

   
   Tecnico tecnico;
   Maquina maquina;

   //Metodo Constructor
    public Actividad(String nombre) {
        this.nombre = nombre;
        cantidadDeActividades++;
    }
   
   
    //Creacion de Metodos getters y setters
    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public static int getCantidadDeActividades() {
        return cantidadDeActividades;
    }

    public double getDuracionEnDias() {
        return duracionEnDias;
    }

    public void setDuracionEnDias(double duracionEnDias) {
        this.duracionEnDias = duracionEnDias;
    }
    
    
    //Metodo CalcularCosto: Calcula el costo de cada actividad
    public double CalcularCosto(){
      
        double CostoTotal=0;
        CostoTotal= (tecnico.getPagoPorDia()*duracionEnDias)+(maquina.getCostoPorDia()*duracionEnDias);
        return CostoTotal;
    }

    //Metodo toString: Convierte el objeto a Cadena
    @Override
    public String toString() {
        return "" + "\nNombre=" + nombre + " \nDuracion En Dias=" + duracionEnDias + "\nTecnico:" + tecnico + "\nMaquina:" + maquina;
    }
    
    
    
   
    
   
   
}
