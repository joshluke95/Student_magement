/* StudentAddressService.java
   Service Interface for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package za.ac.cput.AssignTest2.Service.lookup;

import za.ac.cput.AssignTest2.Domain.StudentAddress;
import za.ac.cput.AssignTest2.Service.IService;

import java.util.List;

public interface StudentAddressService extends IService<StudentAddress, String>
{
    List<StudentAddress> findAll();
}
