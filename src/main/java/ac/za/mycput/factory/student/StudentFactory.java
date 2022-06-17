package ac.za.mycput.factory.student;

import ac.za.mycput.domain.student.Student;
import ac.za.mycput.helper.StringHelper;

public class StudentFactory {
    public static Student createStudent(String studentId, String email){

        StringHelper.checkStringParam("studentId",studentId);
        StringHelper.checkStringParam("email",email);

        return new Student.Builder().setStudentId(studentId).setEmail(email).build();
    }
}
