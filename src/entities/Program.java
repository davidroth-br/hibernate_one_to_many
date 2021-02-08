package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PROGRAM")
public class Program {

    @Id
    @Column(name = "PROGRAM_ID")
    private Integer programId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "HOURS_WEEK")
    private Integer hoursWeek;

    @OneToMany(mappedBy = "program")
    private Set<Student> studentSet;

    public Program() {
    }

    public Program(Integer programId, String name, Integer hoursWeek) {
        this.programId = programId;
        this.name = name;
        this.hoursWeek = hoursWeek;
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHoursWeek() {
        return hoursWeek;
    }

    public void setHoursWeek(Integer hoursWeek) {
        this.hoursWeek = hoursWeek;
    }

    public Set<Student> getStudentList() {
        return studentSet;
    }

    public void setStudentList(Set<Student> studentList) {
        this.studentSet = studentList;
    }
}
