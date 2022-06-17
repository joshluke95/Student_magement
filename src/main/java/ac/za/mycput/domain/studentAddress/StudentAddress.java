/* StudentAddress.java
   Domain for the Student Address
   @ author: Joshua Luke Retief (214234169)
   Date: 18 June 2022
 */

package za.ac.cput.AssignTest2.Domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class StudentAddress implements Serializable
{
    @NotNull @Id private String studentId;
    @NotNull private String address;
    protected StudentAddress(){}

    private StudentAddress (Builder builder)
    {
        this.studentId = builder.studentId;
        this.address = builder.address;
    }

    public String getStudentId(){return studentId;}
    public String getAddress(){return address;}

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder
    {
        private String studentId, address;

        public Builder studentId(String studentId)
        {
            this.studentId=studentId;
            return this;
        }
        public Builder address(String address)
        {
            this.address=address;
            return this;
        }

        public StudentAddress build(){return new StudentAddress(this);}
    }
}
