
import java.util.Arrays;
import static junit.framework.Assert.assertEquals;
import modelo.Ciudadanos;
import modelo.InstitucionesGobierno;
import modelo.ReporteAverias;
import modelo.SeguimientoAverias;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class TestAverias {
    
    public TestAverias() {
    }
    
    Ciudadanos ciuda = new Ciudadanos ("1", "123", "prueba@gmail.com", "Juan", "Perez", "Castro", "Heredia", true);
    InstitucionesGobierno inst = new InstitucionesGobierno (1, "ICE", "ice@pruebas.com", "Electricidad", "prueba", true, false);
    ReporteAverias ave = new ReporteAverias (1, "ICE", "alto",  "22/11/2021", "Heredia", "San Rafel", "San Rafael", "200 mts oeste municipalidad San Rafael", "Cable averiado en poste eléctrico", "IMAGEN", "ICE", "Activo");
    SeguimientoAverias segui = new SeguimientoAverias(1, "001", "Reemplazo de cables en poste eléctrico", 8, 3, 100000, "Ana Torres", "IMAGEN");
    
    
    @Test
    public void InfoCiudadanos() {
        assertEquals("Datos Ciudadanos", ciuda.getCedula(), ciuda.getNombre());
        assertEquals("Datos Ciudadanos", ciuda.getApellido1(), ciuda.getApellido2());
        assertEquals("Datos Ciudadanos", ciuda.getApellido1(), ciuda.getApellido2());
        assertEquals("Datos Ciudadanos", ciuda.getContrasena(), ciuda.getCorreo());
        assertEquals("Datos Ciudadanos", ciuda.getDireccion(), ciuda.getHabilitado());
    }
    
    @Test
    public void InfoInstitucionesGobierno() {
        assertEquals("Datos Instituciones", inst.getIdInstitucion(), inst.getNombreInstitucion());
        assertEquals("Datos Instituciones", inst.getCorreoInstitucion(), inst.getRazonSocial());
        assertEquals("Datos Instituciones", inst.getContrasena(), inst.isReporteador());
        assertEquals("Datos Instituciones", inst.getHabilitado());
    }
    
    @Test
    public void InfoReporteAverias() {
        assertEquals("Datos Reporte Averias", ave.getNumeroAveria(), ave.getUsuario());
        assertEquals("Datos Reporte Averias", ave.getProvincia(), ave.getCanton());
        assertEquals("Datos Reporte Averias", ave.getDistrito(), ave.getDescripcionAveria());
        assertEquals("Datos Reporte Averias", ave.getDireccionExacta(), ave.getInstitucionReportar());
        assertEquals("Datos Reporte Averias", ave.getEstadoAveria());
    }

    @Test
    public void InfoSeguimientoAverias() {
        assertEquals("Datos Seguimiento Averias", segui.getNumeroAveria(), segui.getNumeroSeguimiento());
        assertEquals("Datos Seguimiento Averias", segui.getDescripcionSolucionAveria(), segui.getHorasInvertidas());
        assertEquals("Datos Seguimiento Averias", segui.getCantidadEmpleadosInvolucrados(), segui.getCostoAproximado());
        assertEquals("Datos Seguimiento Averias", segui.getNombrePersonaValidaArreglo(), segui.getImagenFinalizacion());
    }
}
