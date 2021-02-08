package entities;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "STUDENT_ID")
    private Integer studentId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;

    @ManyToOne
    @JoinColumn(name = "PROGRAM_ID")
    private Program program;

    public Student() {
    }

    public Student(Integer studentId, String firstName, String lastName, String email, Program program) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.program = program;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}
