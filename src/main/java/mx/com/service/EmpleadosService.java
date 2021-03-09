package mx.com.service;

import java.util.List;

import mx.com.domain.Employee;

public interface EmpleadosService {
	
	public List<Employee> listarEmpleados(); /*Rresa una lista de personas por eso no regresa nada*/
	
	public void insertarEmpleado(Employee employee); /*Inserta una persona por eso no regresa nada*/
	
	public void eliminarEmpleado(Employee employee); /*Elimina una persona por eso no regresa nada*/
	
	public Employee encontrarEmpleado(Employee employee); /*Regresa un tipo persona porque busca una persona*/
}
