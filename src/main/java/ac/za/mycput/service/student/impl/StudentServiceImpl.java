package ac.za.mycput.service.student.impl;

import ac.za.mycput.domain.student.Student;
import ac.za.mycput.repository.student.StudentRepository;
import ac.za.mycput.service.student.StudentService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student){
        return this.repository.save(student);
    }


    @Override
    public Optional<Student> read(String studentId) {
        return this.repository.findById(studentId);
    }

    @Override
    public Student update(Student studentId) {
        return save(studentId);
    }

    @Override
    public void delete(String s) {
        repository.deleteById(s);

    }


    @Override
    public Set<Student> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
