/* StudentAddressFactory.java
   Factory for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package za.ac.cput.AssignTest2.StudentAddressFactory;

import za.ac.cput.AssignTest2.Domain.StudentAddress;

public class StudentAddressFactory {
    public static StudentAddress build(String studentId, String address)
    {
        if (studentId == null || studentId.isEmpty())
            throw new IllegalArgumentException("Student Id cannot be empty");

        if (address == null || address.isEmpty())
            throw new IllegalArgumentException("Address Field Cannot Be Empty");

        return new StudentAddress.Builder().studentId(studentId).address(address).build();
    }
}
