package com.example.service;
import com.example.dao.StudentMapper;
import com.example.model.StudentModel;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class StudentServiceDatabaseTest {
	
	private StudentService studentService = new StudentServiceDatabase();
	
	@Mock
	private StudentMapper studentMapper;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.studentService = new StudentServiceDatabase(this.studentMapper);
	}
	
	/*@Test
	public void selectStudent() {
		//Given
		StudentModel studentModel = new StudentModel("1506737823","Chanek",3.5);
		StudentModel check = new StudentModel("1506737823","Chanek",3.5);
		BDDMockito.given(studentMapper.selectStudent("1506737823")).willReturn(studentModel);
				
		//When 
		StudentModel test = studentService.selectStudent("1506737823");
		
		//Then
		assertThat(test, notNullValue());//Check if Not Null
		assertThat(test, equalTo(check));//Check if Same
		
	}*/
	
	/*@Test
	public void selectAllStudents() {
		
		//Given
		List<StudentModel> studentModels = new ArrayList<>();
		StudentModel studentModelNew = new StudentModel("1506737823","Chanek",3.5);
		studentModels.add(studentModelNew);		
		
		List<StudentModel> checks = new ArrayList<>();
		StudentModel check = new StudentModel("1506737823","Chanek",3.5);
		checks.add(check);
		
		BDDMockito.given(studentMapper.selectAllStudents()).willReturn(studentModels);
		
		//When
		List<StudentModel> test = studentService.selectAllStudents();
	
		//Then
		assertThat(test,notNullValue());//Check if Not Null
		assertThat(test.isEmpty(), equalTo(false));//Check if Not Empty
		assertThat(test.size(),equalTo(1));//Check if Size Same
		assertThat(test,equalTo(checks));//Check if Same Content
		
	}*/
	
	@Test
	public void addStudent() {
		
		//Given
		StudentModel studentModel = new StudentModel("1506737823","Chanek",3.5);
		StudentModel check = new StudentModel("1506737823","Chanek",3.5);
		BDDMockito.given(studentService.addStudent(studentModel)).willReturn(true);

		//When
		boolean test = studentService.addStudent(studentModel);
		
		//Then
		BDDMockito.then(studentMapper).should().addStudent(check);
		assertThat(test,equalTo(true));//Check if Same
		
	}
	
	/*@Test
	public void deleteStudent() {
		
		//Given
		String studentModel = "1506737823";
		String check = "1506737823";
		BDDMockito.given(studentService.deleteStudent(studentModel)).willReturn(true);
		
		//When
		boolean test = studentService.deleteStudent(studentModel);
		
		//Then
		BDDMockito.then(studentMapper).should().deleteStudent(check);
		assertThat(test,equalTo(true));//Check if Same
	}
	
	@Test
	public void updateStudent() {
		
		//Given
		StudentModel studentModel = new StudentModel("1506737823","Chanek",3.5);
		StudentModel check = new StudentModel("1506737823","Chanek",3.5);
		BDDMockito.given(studentService.updateStudent(studentModel)).willReturn(true);
		
		//When
		boolean test = studentService.updateStudent(studentModel);
		
		//Then
		BDDMockito.then(studentMapper).should().updateStudent(check);
		assertThat(test,equalTo(true));//Check if same
	}*/
	
}
