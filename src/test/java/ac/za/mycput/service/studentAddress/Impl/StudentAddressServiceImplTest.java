/* StudentAddressServiceImplTest.java
   ServiceImpl Test for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package Service.lookup.Impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.AssignTest2.AssignTestApplication;
import za.ac.cput.AssignTest2.Domain.StudentAddress;
import za.ac.cput.AssignTest2.StudentAddressFactory.StudentAddressFactory;
import za.ac.cput.AssignTest2.Service.lookup.StudentAddressService;

import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AssignTestApplication.class)
class StudentAddressServiceImplTest
{
    private StudentAddress studentAddress,saved;
    @Autowired private StudentAddressService service;

    @BeforeEach
    void setUp() {
        this.studentAddress = StudentAddressFactory.build("214234169",
                "20 Old Trafford Manchester");
        this.saved = service.save(this.studentAddress);
    }

    @Test
    void a_save() {
        this.studentAddress = StudentAddressFactory.build("152683924",
                "13 Newton Heath Road");
        this.saved = service.save(this.studentAddress);
        System.out.println(saved);
        assertNotNull(saved);
    }

    @Test
    void b_read() {
        Optional <StudentAddress> read = this.service.read(studentAddress.getStudentId());
        System.out.println(read);
    }

    @Test
    void c_delete() {
        this.service.delete(studentAddress);
    }

    @Test
    List<StudentAddress> d_findAll() {
        return this.service.findAll();

    }
}