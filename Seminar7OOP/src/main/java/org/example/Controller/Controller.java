package org.example.Controller;

import org.example.data.SchoolClass;
import org.example.data.Student;
import org.example.service.HighService;
import org.example.service.MiddleService;
import org.example.service.SmallService;

import java.util.List;

public class Controller {
    private SmallService smallService;
    private MiddleService middleService;
    private HighService highService;

    public Controller() {
        this.smallService = new SmallService();
        this.middleService = new MiddleService();
        this.highService = new HighService();
    }

    public void controller(List<Student> students) {
        for (Student student: students) {
            SchoolClass schoolClass = student.getSchoolClass();
            switch (schoolClass) {
                case SMALL:
                    smallService.learn();
                    smallService.cry();
                    break;
                case MIDDLE:
                    middleService.learn();
                    middleService.smoke();
                    middleService.walkLesson();
                    break;
                case HIGH:
                    highService.learn();
                    highService.smoke();
                    highService.meet();
                    highService.prepareExam();
                    break;
            }
        }
    }
}
