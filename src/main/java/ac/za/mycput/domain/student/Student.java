package ac.za.mycput.domain.student;

import ac.za.mycput.domain.name.Name;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="student")
public class Student {
    @Id

    @NotNull private String studentId;
    @NotNull private String  email;
//    @Embedded
//    private Name name;
//
//    public Name getName() {return name;
//    }

    public Student(Builder builder) {
        this.studentId= builder.studentId;
        this.email= builder.email;
    }
    public Student() {}

    public String getStudentId() {return studentId;}
    public String getStudentEmail() {return email;}


    public static class Builder{
        @Id
       // @GenericGenerator(name="system-uuid", strategy = "uuid")
        @Column(name="student_id")
        private String studentId;
        @Column(name="email")

        private String  email;

        public Builder setStudentId(String studentId){
            this.studentId= studentId;
            return this;
        }


        public Builder setEmail(String email){
            this.email= email;
            return this;
        }

        public Builder copy(Student student){

            this.studentId=student.studentId;
            this.email=student.email;

            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}







