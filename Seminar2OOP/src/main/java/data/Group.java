package data;

import java.util.List;

public class Group {

   private Teacher teacher;
   private List<Student> students;

   private String groupName;

   public Group(Teacher teacher, List<Student> students, String groupName) {
       this.teacher = teacher;
       this.students = students;
       this.groupName = groupName;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName=" + groupName+
                "teacher=" + teacher +
                ", students=" + students.size() +
                '}';
    }
}
