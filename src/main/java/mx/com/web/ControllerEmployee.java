package mx.com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import mx.com.domain.Employee;
import mx.com.service.EmployeeService;


@Controller
public class ControllerEmployee {
/*	
	@Autowired
    private EmployeeService employeeService;
    
	
    @GetMapping("/")
    public String inicio(Model model){
        var empleados = employeeService.listarEmpleados();
 
        model.addAttribute("empleados", empleados);
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Employee empleado){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Employee empleado){
    	employeeService.insertarEmpleados(empleado);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idEmployee}")
    public String editar(Employee empleado, Model model){
    	empleado = employeeService.encontrarEmpleados(empleado);
        model.addAttribute("empleado", empleado);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Employee empleado) {
    	
    	employeeService.eliminarEmpleados(empleado);
		return "redirect:/";
    	
    }*/
	

}
