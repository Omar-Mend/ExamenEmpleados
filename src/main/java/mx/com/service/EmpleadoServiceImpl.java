package mx.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.dao.IEmployeeDao;
import mx.com.domain.Employee;

@Service
public class EmpleadoServiceImpl implements EmpleadosService {
	
	@Autowired
	private IEmployeeDao iEmployeeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Employee> listarEmpleados() {
		
		return (List<Employee>) iEmployeeDao.findAll();
	}

	@Override
	@Transactional
	public void insertarEmpleado(Employee employee) {

		iEmployeeDao.save(employee);
	}

	@Override
	@Transactional
	public void eliminarEmpleado(Employee employee) {
		
		iEmployeeDao.delete(employee);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Employee encontrarEmpleado(Employee employee) {
		
		employee = iEmployeeDao.findById(employee.getIdEmployee()).orElse(null);
		
		return employee;
	}


	
}
