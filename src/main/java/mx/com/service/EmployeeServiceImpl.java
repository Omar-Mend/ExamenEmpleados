package mx.com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.dao.EmployeeDao;
import mx.com.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDao employeeDao = new EmployeeDao();
	
	@Override
	@Transactional(readOnly = true)
	public List<Employee> listarEmpleados() {
		
		return employeeDao.listarEmpleados();
	}

	@Override
	public void insertarEmpleados(Employee employee) {
		
		if(employee != null && employee.getIdEmployee() == null ){
			employeeDao.insertarEmpleado(employee);
		}
		else {
			employeeDao.actualizarEmpleado(employee);
		}
		
	}

	@Override
	public void eliminarEmpleados(Employee employee) {
		
		employeeDao.eliminarEmpleado(employee);
		
	}

	@Override
	public Employee encontrarEmpleados(Employee employee) {
		
		employee = employeeDao.buscarIdEmpleado(employee);
		
		//employee = iEmployeeDao.findById(employee.getIdEmployee()).orElse(null);

		
		return employee;
	}

	@Override
	public void actualizarPersona(Employee employee) {
		
		employeeDao.actualizarEmpleado(employee);
		
	}
	
	

}
