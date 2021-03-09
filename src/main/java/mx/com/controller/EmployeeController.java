package mx.com.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import mx.com.domain.Employee;
import mx.com.service.EmpleadosService;
import mx.com.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmpleadosService empleadosService;
	
	@RequestMapping(value = "/empleados", method = RequestMethod.GET)
	public List<Employee> listarEmpleados(){
		return this.employeeService.listarEmpleados();
	}

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@GetMapping("/empleados/{id}")
	public Employee encontrarEmpleados(@PathVariable Employee id){
	
		return empleadosService.encontrarEmpleado(id);
	}
	

	
	 @POST
	 @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	 @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	 @PostMapping("/agregarEmpleado")
	 public Response agregarEmpleado(Employee employee) {
	        try {
	        	employeeService.insertarEmpleados(employee);
	    		return Response.ok().entity(employee).build();
	        } catch (Exception e) {
	            e.printStackTrace(System.out);
	            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
	        }
	    }

	    @PUT
	    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	    @PostMapping("/modificarEmpleado/{id}")
	    public Response modificarEmpleado(@PathParam("id") int id, Employee employeeModificada) {
	        try {
	        	Employee employee = employeeService.encontrarEmpleados(new Employee(id));
	            if (employee != null) {
	            	employeeService.actualizarPersona(employeeModificada);
	                return Response.ok().entity(employeeModificada).build();
	            } else {
	                return Response.status(Status.NOT_FOUND).build();
	            }
	        } catch (Exception e) {
	            e.printStackTrace(System.out);
	            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
	        }
	    }

	    @DELETE
	    @Path("{id}")
	    @PostMapping("/eliminarEmpleado/{id}")
	    public Response eliminarPersonaPorId(@PathParam("id") int id) {
	        try {
	        	employeeService.eliminarEmpleados(new Employee(id));
	            return Response.ok().build();
	        } catch (Exception e) {
	            e.printStackTrace(System.out);
	            return Response.status(404).build();
	        }
	    }

	
	

}
