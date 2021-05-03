package de.mchristia.demolocal.controller;

import de.mchristia.demolocal.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(new Student("Marc", "1"),
                new Student("Groß'ATuin", "2"),
                new Student("Klingbin", "3"),
                new Student("Rincewind", "4")
                );
    }
}
