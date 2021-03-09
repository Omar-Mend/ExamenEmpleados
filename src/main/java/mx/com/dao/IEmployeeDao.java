package mx.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.domain.Employee;


public interface IEmployeeDao extends JpaRepository<Employee, Integer>{

}
