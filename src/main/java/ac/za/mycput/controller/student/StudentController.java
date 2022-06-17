package ac.za.mycput.controller.student;


import ac.za.mycput.domain.student.Student;
import ac.za.mycput.factory.student.StudentFactory;
import ac.za.mycput.service.student.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.Optional;
import java.util.Set;

@RestController
@Slf4j

public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("student/list")
    public ResponseEntity<Set<Student>> list(){
        Set<Student> student=this.service.getAll();
        return  ResponseEntity.ok(student);
    }
    @GetMapping("student/{id}")
   @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student>read ( @PathVariable String id){
        log.info("read request :{}",id);
        Student student =service.read(id).orElseThrow(()-> {
            return new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
        return ResponseEntity.ok(student);
    }
    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student save ( @RequestBody Student student){
//        Student obj;
//        try{
//            obj= StudentFactory.createStudent(student.getStudentId(),student.getStudentEmail());
//        }catch (IllegalArgumentException e){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
//        }
//
//         log.info("save request :{}",student);
//        Student save =service.save(obj);
         return service.save(student);
    }

   private Optional<Student>getById(String id){
        return this.service.read(id);
   }
    @DeleteMapping(value = "student/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        Optional<Student> student =this.service.read(id);
        if (student.isPresent()) this.service.delete(id);
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
//@DeleteMapping(value = "student/{id}")
//
//@ResponseStatus(HttpStatus.OK)
//public void delete(@PathVariable("id") String id) {
//    service.delete(id);
//}
    @PutMapping(value = "student/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) String id, @RequestBody Student student) {
        // Preconditions.checkNotNull(resource);
        //service.getById(resource.getId()));
        service.update(student);
    }

}