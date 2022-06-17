/* StudentAddressRepository.java
   Repository for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package za.ac.cput.AssignTest2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.AssignTest2.Domain.StudentAddress;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress,String>{}
