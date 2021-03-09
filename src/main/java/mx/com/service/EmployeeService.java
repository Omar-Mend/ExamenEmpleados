package mx.com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.com.domain.Employee;

@Service
public interface EmployeeService {
	
	public List<Employee> listarEmpleados(); 
	
	public void insertarEmpleados(Employee employee);
	
	public void eliminarEmpleados(Employee employee); 
	
	public Employee encontrarEmpleados (Employee employee); 
	
	public void actualizarPersona(Employee employee);
	

}
