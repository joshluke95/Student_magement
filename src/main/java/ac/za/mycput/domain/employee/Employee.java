package ac.za.mycput.domain.employee;



import ac.za.mycput.domain.name.Name;

import javax.persistence.Embedded;
import javax.persistence.Transient;

public class Employee {
    private String staffId,email;

    public Name getName() {
        return name;
    }

    @Embedded
    private Name name;

    protected Employee() {
    }
}
