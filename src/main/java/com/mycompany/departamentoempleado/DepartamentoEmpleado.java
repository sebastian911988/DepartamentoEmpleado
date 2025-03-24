/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.departamentoempleado;

import DepartamentoEmpleado.logica.Departamento;
import DepartamentoEmpleado.logica.Empleado;
import DepartamentoEmpleado.logica.ReporteDesempeño;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class DepartamentoEmpleado {

    public static void main(String[] args) {  
        List<Departamento> listaDepartamentos = new ArrayList<>();  

        // Crear empleados  
        Empleado emp1 = Empleado.crear(1, "Juan", "Pérez", "permanente", 101);  
        Empleado emp2 = Empleado.crear(2, "Ana", "Gómez", "temporal", 102);  

        // Crear departamentos  
        Departamento depto1 = Departamento.crear(101, "Recursos Humanos");  
        Departamento depto2 = Departamento.crear(102, "Finanzas");  

        // Agregar empleados a departamentos  
        try {  
            depto1.agregarEmpleado(emp1);  
            depto1.agregarEmpleado(emp2);  
        } catch (IllegalArgumentException e) {  
            System.err.println("Error al agregar empleado: " + e.getMessage());  
        }  

        // Agregar departamentos a la lista  
        listaDepartamentos.add(depto1);  
        listaDepartamentos.add(depto2);  

        // Listar empleados en el departamento  
        System.out.println("Empleados en el departamento " + depto1.obtenerNombre() + ":");  
        List<String> empleados = depto1.listarEmpleados();  
        for (String info : empleados) {  
            System.out.println(info);  
        }  

        // Actualizar empleado  
        try {  
            emp1.actualizar("Juan Carlos", "Pérez", "permanente", 102);  
            System.out.println("Empleado actualizado: " + emp1.obtenerInfo());  
        } catch (Exception e) {  
            System.err.println("Error al actualizar empleado: " + e.getMessage());  
        }  

        // Generar y mostrar reporte de desempeño  
        ReporteDesempeño reporte = ReporteDesempeño.crear(1, emp1.getId(), "Excelente desempeño");  
        System.out.println(reporte.obtenerReporte());  

        // Remover un empleado  
        try {  
            depto1.removerEmpleado(emp2.getId());  
            System.out.println("Empleado Ana eliminado.");  
        } catch (IllegalArgumentException e) {  
            System.err.println("Error: " + e.getMessage());  
        }  

        // Listar empleados después de eliminar  
        System.out.println("Empleados después de eliminar a Ana:");  
        for (String info : depto1.listarEmpleados()) {  
            System.out.println(info);  
        }  

        // Buscar un departamento  
        try {  
            Departamento deptoBuscado = Departamento.buscar(listaDepartamentos, 101);  
            if (deptoBuscado != null) {  
                System.out.println("Departamento encontrado: " + deptoBuscado.obtenerNombre());  
            } else {  
                System.out.println("Departamento no encontrado.");  
            }  
        } catch (Exception e) {  
            System.err.println("Error al buscar departamento: " + e.getMessage());  
        }  

        // Eliminar un departamento  
        try {  
            depto1.eliminar(listaDepartamentos);  
            System.out.println("Departamento " + depto1.obtenerNombre() + " eliminado.");  
        } catch (IllegalArgumentException e) {  
            System.err.println("Error: " + e.getMessage());  
        }  

        // Listar departamentos restantes  
        System.out.println("Departamentos restantes:");  
        for (Departamento depto : listaDepartamentos) {  
            System.out.println(depto.obtenerNombre());  
        }  
    }  
}
