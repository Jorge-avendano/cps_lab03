package pe.edu.tecsup.lab03.controllers.pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private StudentService studentService = new StudentService();

    public void createStudent(Long id, String name, String email) {
        System.out.println("[Controller] Petición HTTP recibida para crear estudiante");
        StudentEntity newStudent = new StudentEntity(id, name, email);
        studentService.registerStudent(newStudent);
    }
}
