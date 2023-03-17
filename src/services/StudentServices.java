package services;

import models.Group;
import models.Student;

import java.util.List;

public interface StudentServices {
    void addNewStudentToGroup(List<Group> groups, List<Student>studentList,String name);
    void updateStudent(List<Student>studentList,String name);
    Student findByName(String name,List<Student>students);
    void getAllStudentByGroupName(String name,List<Student>studentList,List<Group>groupList);
   void getAllStudentsLesson(List<Group>groups, List<Student>studentList, String lessonName);
void deleteStudent(List<Student>studentList,String name);

}
