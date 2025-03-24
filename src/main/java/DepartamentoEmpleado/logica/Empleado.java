/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartamentoEmpleado.logica;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;  
import java.util.List;  

public class Empleado {  
    private int id;  
    private String nombre;  
    private String apellido;  
    private String tipo; // "permanente" o "temporal"  
    private int departamentoId;  

    public Empleado(int id, String nombre, String apellido, String tipo, int departamentoId) {  
        this.id = id;  
        this.nombre = nombre;  
        this.apellido = apellido;  
        this.tipo = tipo;  
        this.departamentoId = departamentoId;  
    }  

    public static Empleado crear(int id, String nombre, String apellido, String tipo, int departamentoId) {  
        return new Empleado(id, nombre, apellido, tipo, departamentoId);  
    }  

    public void actualizar(String nombre, String apellido, String tipo, int departamentoId) {  
        this.nombre = nombre;  
        this.apellido = apellido;  
        this.tipo = tipo;  
        this.departamentoId = departamentoId;  
    }  

    public static Empleado buscar(List<Empleado> empleados, int id) {  
        for (Empleado emp : empleados) {  
            if (emp.id == id) {  
                return emp;  
            }  
        }  
        return null; 
    }  

    public void eliminar(List<Empleado> empleados) {  
        empleados.remove(this);  
    }  

    public String obtenerInfo() {  
        return String.format("ID: %d, Nombre: %s %s, Tipo: %s, Departamento ID: %d",  
                id, nombre, apellido, tipo, departamentoId);  
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

   

   

   
    

   
}  