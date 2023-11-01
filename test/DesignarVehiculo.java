import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import relaciones.*;
import java.util.Date;


/**
 *
 * @author Kevin
 */
public class DesignarVehiculo {
    private Persona persona1;
    private Persona persona2;
    private Carro carro1;
    private Carro carro2;
    private Moto moto1;
    private Camion camion1;
    
    public DesignarVehiculo(){
    }
    
    @BeforeEach
    public void setUp(){
        persona1 = new Persona("Juan", "perez", "123456789", "22/10/1999");
        persona2 = new Persona("Andres", "Narvaez", "987654321", "22/10/1999");
        
        carro1 = new Carro("MQN365");
        carro2 = new Carro("TUJ841");
        moto1 = new Moto("KRF37W");
        camion1 = new Camion("PSD465", 4);  
    }
    
    
    @Test
    public void desasignarVehiculo(){             
        persona1.asignarVehiculo(carro1);
        persona1.desasignarVehiculo(carro1);
        assertEquals(0, persona1.vehiculos.size());
    }
    
    @Test
    public void TestCalcularTotalPeaje(){
        persona1.asignarVehiculo(carro1);
        persona1.asignarVehiculo(moto1);
        persona2.asignarVehiculo(carro2);
        persona2.asignarVehiculo(camion1);
        persona1.calcularTotalPeajes();
        persona2.calcularTotalPeajes();
       assertEquals(15000, persona1.totalPeajes);
       assertEquals(30000, persona2.totalPeajes);
    }
    
    @Test 
    void obtenerTarifaCarro(){
        assertEquals(10000, carro1.getValorPeaje());
    }
    
    @Test 
    void obtenerTarifaMoto(){
        assertEquals(5000, moto1.getValorPeaje());
    }
    
    @Test 
    void obtenerTarifaCamion(){
        assertEquals(20000, camion1.valorPeajeEje());
    }
    
    @Test 
    void obtenerNumeroDeEjesCamion(){
        assertEquals(4, camion1.numeroEjes);
    }    
}