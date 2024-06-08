package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {
    @GetMapping("/calculateSalary")
    public double calculateSalary(@RequestParam int hoursWorked) {
        double salary;
        if (hoursWorked <= 40) {
            salary = hoursWorked * 16;
        } else {
            salary = 40 * 16 + (hoursWorked - 40) * 20;
        }
        return salary;
    }
}
