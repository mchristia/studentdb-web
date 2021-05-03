package de.mchristia.demolocal.services;

import de.mchristia.demolocal.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentenService {

    private List<Student> stundentList = List.of(new Student("Marc", "1"),
            new Student("Groß'ATuin", "2"),
            new Student("Klingbin", "3"),
            new Student("Rincewind", "4"),
            new Student("Tourist", "5"),
            new Student("Simba", "6")
    );

    public List<Student> getStundentList() {
        return stundentList;
    }

    public Optional<Student> findById(String id){
        List<Student> list = stundentList;
        for(Student student : list){
            if(student.getId().equals(id)){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public List<Student> findByLetter(String letter){
        List<Student> foundByLetter = new ArrayList<>();
        for (Student student : stundentList) {
            if(student.getName().toLowerCase().contains(letter.toLowerCase())){
                foundByLetter.add(student);
            }
        }
        return foundByLetter;
    }
}
