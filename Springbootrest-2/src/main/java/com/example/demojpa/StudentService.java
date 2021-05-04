package com.example.demojpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	List<Student> students = new ArrayList<>();

	public void createStudents() {
		students.add(new Student(1, "aaa", 1, 11));
		students.add(new Student(2, "bbb", 2, 22));
		students.add(new Student(3, "ccc",3, 33));
		students.add(new Student(4, "ddd", 4, 44));
	}

	public List<Student> getStudents(){
		createStudents();
		return students;
	}
	
	public Student getStudent(int id) {
		Student student = students.stream().filter(s -> s.getId() == id).findFirst().get();
		return student;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> displayStudents() {
		return students;
	}

	public void updateStudent(int id, Student obj) {
		for(int i=0;i<students.size();i++) {
			if(id == students.get(i).id) {
				students.set(i, obj);
				return;
			}
		}
	}

	public void deleteStudent(int id) {
		students.removeIf(s-> s.getId() == id);
	}

}
