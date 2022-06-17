package ac.za.mycput.service.student;

import ac.za.mycput.domain.student.Student;
import ac.za.mycput.service.IService;

import java.util.Set;

public interface StudentService extends IService<Student,String> {
    Set<Student> getAll();
}
