package pe.edu.tecsup.lab03.repositories.pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<StudentEntity> databaseMock = new ArrayList<>();

    public void save(StudentEntity student) {
        databaseMock.add(student);
        System.out.println("[Repository] Estudiante guardado en BD: " + student.getName());
    }

    public List<StudentEntity> findAll() {
        return databaseMock;
    }
}
