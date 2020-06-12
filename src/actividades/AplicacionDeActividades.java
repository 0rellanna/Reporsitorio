
package actividades;

/**
 *
 * Nombre: Alexis Orellana Deras
 * Carnet: OD18003
 * GD: 02
 * TERCERA PRACTICA EVALUADA
 * Docente: Ing Yessenia Vigil
 */
public class AplicacionDeActividades {
    
    public static void main(String[]args){
        
        //Creando Objeto 1 de tecnico
        Tecnico tecnico1 = new Tecnico();
        tecnico1.setIdentificador("OD18003");
        tecnico1.setPagoPorDia(50.10);
        
        //Creando Objeto 2 de tecnico
        Tecnico tecnico2 = new Tecnico();
        tecnico2.setIdentificador("OD19000");
        tecnico2.setPagoPorDia(60.10);
        
        //Creando Objeto 1 de Maquina 
        Maquina maquina1 = new Maquina();
        maquina1.setCostoPorDia(100.90);
        maquina1.setModelo("Toyota");
        
        //Creacion de Objeto 2 Maquina 
        Maquina maquina2 = new Maquina();
        maquina2.setCostoPorDia(80.90);
        maquina2.setModelo("NISSAN");
        
        //Creacion de objeto 1 Actividad
        Actividad actividad1 = new Actividad("Construccion");
        actividad1.setDuracionEnDias(30);
        actividad1.setMaquina(maquina1);
        actividad1.setTecnico(tecnico1);
        
        //Creacion de objeto 2 de Actividad
        Actividad actividad2 = new Actividad("Reparacion");
        actividad2.setDuracionEnDias(60);
        actividad2.setMaquina(maquina2);
        actividad2.setTecnico(tecnico2);
        
        
        //Imprimiendo Datos de Actividad
        System.out.println("\nActividad 1");
        System.out.println(actividad1);
        
        System.out.println("\nActividad 2: ");
        System.out.println(actividad2);
        
        //Impresion de datos de Actividades
        
        System.out.println("\n Costo de la Actividad 1: "+actividad1.CalcularCosto());
        System.out.println("\n Costo de la Actividad 2: "+actividad2.CalcularCosto());
        
        
        //impresion de catidad de Actividades
        System.out.println("\n Cantidad de Actividades: "+Actividad.getCantidadDeActividades());
        
    }
}
