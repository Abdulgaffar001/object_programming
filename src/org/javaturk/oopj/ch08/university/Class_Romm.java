package org.javaturk.oopj.ch08.university;


import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;

public class Class_Romm {
	
	String name;
	Student[] student;
	Professor professor;
	Course course;
	Department department;
	
	

	public static void main(String[] args) {
		
	   Class_Romm mathClass_Romm =new Class_Romm();
	   mathClass_Romm.name="1/A sinifi";

	   Professor professor6=new Professor();
	   professor6.name="Abdulgaffar Ertekin";

	   Professor professor1=new  Professor() ;
	   professor1.name="Nurtan";
	   
	   Professor professor2=new  Professor() ;
	   professor2.name="Filiz";
	   
	   Professor professor3=new  Professor() ;
	   professor3.name="Veysi";
	   
	   Professor professor4=new  Professor() ;
	   professor4.name="Mehmet Zahir";
	   
	   Professor professor5=new  Professor() ;
	   professor5.name="Ratibe";
	   
	   Course matematikCourse= new Course();
	   matematikCourse.name="Matematik kursu";

	   Course turkceCourse = new Course();
	   turkceCourse.name="Turkce kursu";
	   Course kimyaCourse=new Course();
	   kimyaCourse.name="Kimya kursu";
	   Course fizikCourse = new Course();
	   fizikCourse.name="Fizik kursu";
	   Course biyolojiCourse=new Course();
	   biyolojiCourse.name="Biyoloji kursu";
	   
	   professor1.coursesGiven=new Course[5];
	   professor1.coursesGiven[0]=matematikCourse;
	   
	   professor2.coursesGiven=new Course[5];
	   professor2.coursesGiven[0]=turkceCourse;
	   
	   professor3.coursesGiven=new Course[5];
	   professor3.coursesGiven[0]=kimyaCourse;
	   
	   professor4.coursesGiven=new Course[5];
	   professor4.coursesGiven[0]=fizikCourse;
	   
	   professor5.coursesGiven=new Course[5];
	   professor5.coursesGiven[0]=biyolojiCourse;

		Department department1 = new Department();
		department1.name = "Sayısal departmanı";

		Department department=new Department();
		department.head = professor6;
		professor6.department = department;

		Student student1 = new Student();
		student1.name = "Hayrunisa";
		Student student2 = new Student();
		student2.name = "Emine";
		Student student3 = new Student();
		student3.name = "Yusuf";
		Student student4 = new Student();
		student4.name = "Bunyamin";
		Student student5 = new Student();
		student5.name = "Yakub";

		professor1.advisee = new Student[5];
		professor1.advisee[0] = student1;
		student1.advisor = professor1;
		professor2.advisee = new Student[5];
		professor2.advisee[0] = student2;
		student2.advisor = professor2;
		professor3.advisee = new Student[5];
		professor3.advisee[0] = student3;
		student3.advisor = professor3;
		professor4.advisee = new Student[5];
		professor4.advisee[0] = student4;
		student4.advisor = professor4;
		professor5.advisee = new Student[5];
		professor5.advisee[0] = student5;
		student5.advisor = professor5;


		student2.coursesTaken=new Course[7];
		student2.coursesTaken[0]=turkceCourse;
		student3.coursesTaken=new Course[7];
		student3.coursesTaken[0]=kimyaCourse;
		student4.coursesTaken=new Course[7];
		student4.coursesTaken[0]=fizikCourse;
		student5.coursesTaken=new Course[7];
		student5.coursesTaken[0]=biyolojiCourse;

		matematikCourse.students = new Student[10];
		student1.coursesTaken = new Course[7];
		student1.coursesTaken[0] = matematikCourse;


		matematikCourse.students[0] = student1;


		fizikCourse.students = new Student[10];
		fizikCourse.students[0] = student4;
		biyolojiCourse.students = new Student[10];
		biyolojiCourse.students[0] = student5;
		kimyaCourse.students = new Student[10];
		kimyaCourse.students[0] = student3;
		turkceCourse.students = new Student[10];
		turkceCourse.students[0] = student2;

		System.out.println(" Departman başkanı "+department.head.name);
		System.out.println("Birinci Ogrenci "+student1.name+" gitigi kurs "+student1.coursesTaken[0].name+" profesosu "+student1.advisor.name);
		System.out.println("############################################################################################################");
		System.out.println("İkinci Ogrenci "+student2.name+" gitigi kurs "+student2.coursesTaken[0].name+" profesosu "+student2.advisor.name);
		System.out.println("############################################################################################################");
		System.out.println("Ucuncu Ogrenci "+student3.name+" gitigi kurs "+student3.coursesTaken[0].name+" profesosu "+student3.advisor.name);
		System.out.println("############################################################################################################");
		System.out.println("Dorduncu Ogrenci "+student4.name+" gitigi kurs "+student4.coursesTaken[0].name+" profesosu "+student4.advisor.name);
		System.out.println("############################################################################################################");
		System.out.println("Besinci Ogrenci "+student5.name+" gitigi kurs "+student5.coursesTaken[0].name+" profesosu "+student5.advisor.name);
		System.out.println("############################################################################################################");





	}

}
