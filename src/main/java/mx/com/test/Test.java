package mx.com.test;

import java.util.List;

import mx.com.dao.EmployeeWorkedHoursDao;

public class Test {
	public static void main(String[] args) {
		/*Employee employee = new Employee();
		
		
		EmployeeDao employeeDao  = new EmployeeDao();
		employeeDao.buscarIdEmpleado(employee);*/

		EmployeeWorkedHoursDao employeeWorkedHoursDao = new EmployeeWorkedHoursDao();
		imprimir(employeeWorkedHoursDao.listarHorasTrabajadas());
		
		
		
		
	}
	
	private static void imprimir(List coleccion) {
		for(Object o: coleccion) {
			System.out.println("valor = " + o);
		}
	}

	
}
