package com.example.CabinetPsihologic;

import com.example.CabinetPsihologic.Entity.Doctor;
import com.example.CabinetPsihologic.Entity.Pacient;
import com.example.CabinetPsihologic.Entity.Programare;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    CabinetService cabinetService;

    @GetMapping("/info")
    public String info() {
        return "Cabinet Psihologic.";
    }

    @GetMapping("/patient/{id}")
    public Pacient getPacient(@PathVariable Integer id) {
        return cabinetService.getPacientById(id);
    }

    @GetMapping("/doctor/{id}")
    public Doctor getDoctor(@PathVariable Integer id) {
        return cabinetService.getDoctorById(id);
    }

    @PostMapping("/programare")
    public Programare creareProgramare() {
        return cabinetService.createApp();
    }
}
