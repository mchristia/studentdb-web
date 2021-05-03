package de.mchristia.demolocal.controller;

import de.mchristia.demolocal.model.Student;
import de.mchristia.demolocal.services.StudentenService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("student")
public class StudentController {


    @GetMapping( "all")
    public List<Student> getStudents(){
        return new StudentenService().getStundentList();
    }

    @GetMapping(path = "{id}")
    public Optional<Student> getStudentById(@PathVariable String id){
        Optional<Student> chosenStudent = new StudentenService().findById(id);
        return chosenStudent;
    }

    @GetMapping
    public List<Student> search(@RequestParam String q){
        return new StudentenService().findByLetter(q);
    }

}
