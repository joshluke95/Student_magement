package ac.za.mycput.controller.student;

import ac.za.mycput.domain.student.Student;
import ac.za.mycput.factory.student.StudentFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentControllerTest {
@LocalServerPort
private int port;
@Autowired private StudentController controller;
@Autowired private TestRestTemplate restTemplate;
private Student student;
private String baseUrl;
@BeforeEach
     void setUp(){
     this.student= StudentFactory.createStudent("99","thimsmarco@com");
     this.baseUrl ="http://localHost:"+this.port+"/student/";

     }
    @Test
    void testList() {
    }

    @Test
    void read() {
    }

    @Test
    void save() {
     String url= baseUrl+ "create";
        System.out.println(url);
        ResponseEntity<Student> response=this.restTemplate.postForEntity(url,this.student,Student.class);
        System.out.println(response);
        assertAll(
                ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
                ()-> assertNotNull(response.getBody())
        );
    }

    @Test
    void testDelete() {
    }

    @Test
    void testUpdate() {
    }
}