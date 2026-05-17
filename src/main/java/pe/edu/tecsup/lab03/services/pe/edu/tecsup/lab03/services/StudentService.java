package pe.edu.tecsup.lab03.services.pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.pe.edu.tecsup.lab03.repositories.StudentRepository;
import java.util.List;

public class StudentService {
    private StudentRepository studentRepository = new StudentRepository();

    public void registerStudent(StudentEntity student) {
        System.out.println("[Service] Procesando lógica para: " + student.getName());
        // Aquí irían validaciones (ej. si el correo ya existe)
        studentRepository.save(student);
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}