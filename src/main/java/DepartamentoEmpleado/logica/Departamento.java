/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartamentoEmpleado.logica;

import java.util.ArrayList;  
import java.util.List;  

public class Departamento {  

    public static Object logica;
    private int id;  
    private String nombre;  
    private List<Empleado> listaEmpleados;  

    public Departamento(int id, String nombre) {  
        this.id = id;  
        this.nombre = nombre;  
        this.listaEmpleados = new ArrayList<>();  
    }  

    public static Departamento crear(int id, String nombre) {  
        return new Departamento(id, nombre);  
    }  

    public void agregarEmpleado(Empleado empleado) throws IllegalArgumentException {  
        if (listaEmpleados.contains(empleado)) {  
            throw new IllegalArgumentException("El empleado ya está en el departamento.");  
        }  
        listaEmpleados.add(empleado);  
    }  

    public void actualizar(String nombre) {  
        this.nombre = nombre;  
    }  

    public static Departamento buscar(List<Departamento> departamentos, int id) {  
        for (Departamento depto : departamentos) {  
            if (depto.id == id) {  
                return depto;  
            }  
        }  
        return null; 
    }  

    public void eliminar(List<Departamento> departamentos) {  
        departamentos.remove(this);  
    }  

    public Empleado buscarEmpleado(int empleadoId) {  
        return Empleado.buscar(listaEmpleados, empleadoId);  
    }  

    public void removerEmpleado(int empleadoId) throws IllegalArgumentException {  
        Empleado empleado = buscarEmpleado(empleadoId);  
        if (empleado != null) {  
            empleado.eliminar(listaEmpleados);  
        } else {  
            throw new IllegalArgumentException("Empleado no encontrado en el departamento.");  
        }  
    }  

    public List<String> listarEmpleados() {  
        List<String> infoEmpleados = new ArrayList<>();  
        for (Empleado emp : listaEmpleados) {  
            infoEmpleados.add(emp.obtenerInfo());  
        }  
        return infoEmpleados;  
    }  

    public String obtenerNombre() {  
        return nombre;  
    }  

    public int getId() {  
        return id;  
    }  
}  
