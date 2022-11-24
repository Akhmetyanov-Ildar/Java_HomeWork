package data;

import java.util.List;

public class Group {

   private Teacher teacher;
   private List<Student> students;

   public Group(Teacher teacher, List<Student> students) {
       this.teacher = teacher;
       this.students = students;
   }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "teacher=" + teacher +
                ", students=" + students.size() +
                '}';
    }
}
