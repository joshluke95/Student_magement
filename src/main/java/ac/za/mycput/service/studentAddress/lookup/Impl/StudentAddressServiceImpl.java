/* StudentAddressServiceImpl.java
   Service for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package za.ac.cput.AssignTest2.Service.lookup.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.AssignTest2.Domain.StudentAddress;
import za.ac.cput.AssignTest2.Repository.StudentAddressRepository;
import za.ac.cput.AssignTest2.Service.lookup.StudentAddressService;
import java.util.List;
import java.util.Optional;

@Service
public class StudentAddressServiceImpl implements StudentAddressService
{
    private final StudentAddressRepository repository;

    private StudentAddressServiceImpl(StudentAddressRepository repository){
        this.repository = repository;
    }


    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        return this.repository.save(studentAddress);
    }

    @Override
    public Optional<StudentAddress> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(StudentAddress studentAddress) {
        this.repository.delete(studentAddress);

    }

    @Override
    public List<StudentAddress> findAll() {
        return this.repository.findAll();
    }
}

