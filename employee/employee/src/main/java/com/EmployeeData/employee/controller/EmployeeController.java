package com.EmployeeData.employee.controller;

import com.EmployeeData.employee.entity.Employee;
import com.EmployeeData.employee.service.EmployeeService;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//@RequiredArgsConstructor
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmployeeController {

    private final EmployeeService employeeService;
   
    @PostMapping("/employee")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeService.postEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
}

@DeleteMapping("/employee/{id}")
public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
   try {
    employeeService.deleteEmployee(id);
    return ResponseEntity.ok("Employee deleted successfully");
   } catch (Exception e) {
    return ResponseEntity.status(404).body("Employee not found");
   }
}

@GetMapping("/employee/{id}")
public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
    Employee employee = employeeService.getEmployeeById(id);
    return ResponseEntity.ok(employee);
}

@PatchMapping("/employee/{id}")
public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
    Employee updatedEmployee = employeeService.updateEmployee(id, employee);
   
    if (updatedEmployee != null) {
        return ResponseEntity.ok(updatedEmployee);
    } else {
        return ResponseEntity.status(404).body("Employee not found");
    }
}

}