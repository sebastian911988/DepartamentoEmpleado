/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartamentoEmpleado.logica;

/**
 *
 * @author Usuario
 */
public class ReporteDesempeño {  
    private int id;  
    private int empleadoId;  
    private String metricas;  

    public ReporteDesempeño(int id, int empleadoId, String metricas) {  
        this.id = id;  
        this.empleadoId = empleadoId;  
        this.metricas = metricas;  
    }  

    public static ReporteDesempeño crear(int id, int empleadoId, String metricas) {  
        return new ReporteDesempeño(id, empleadoId, metricas);  
    }  

    public void actualizar(String metricas) {  
        this.metricas = metricas;  
    }  

    public String obtenerReporte() {  
        return String.format("ID: %d, Empleado ID: %d, Métricas: %s", id, empleadoId, metricas);  
    }  

    public static ReporteDesempeño buscar(ReporteDesempeño[] reportes, int id) {  
        for (ReporteDesempeño reporte : reportes) {  
            if (reporte.id == id) {  
                return reporte;  
            }  
        }  
        return null; 
    }  

    public void eliminar(ReporteDesempeño[] reportes) {  
     
    }  
}  