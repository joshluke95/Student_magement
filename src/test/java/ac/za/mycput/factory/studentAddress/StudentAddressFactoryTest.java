/* StudentAddressFactoryTest.java
   Factory Test for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.AssignTest2.Domain.StudentAddress;
import za.ac.cput.AssignTest2.StudentAddressFactory.StudentAddressFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudentAddressFactoryTest {
    @Test
    public void StudentAddressPass(){
        StudentAddress studentAddress = StudentAddressFactory.build("214234169",
                "20 Old Trafford Manchester");
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

    @Test
    public void StudentIdTestPass(){
        StudentAddress studentAddress = StudentAddressFactory.build("",
                "20 Old Trafford Manchester");
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

    @Test
    public void StudentAddressTestFail(){
        StudentAddress studentAddress = StudentAddressFactory.build("214234169",
                "");
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }

}