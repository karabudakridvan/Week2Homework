
public class Main {

	public static void main(String[] args) {
		System.out.println("**********************************************************");
		System.out.println("COURSE DETAILS INFORMATIONS");
		Course course1 =new Course(1, "C# Programalama Kursu", "Engin Demiroð");
		Course course2 =new Course(2, "JAVA Programalama Kursu", "Engin Demiroð");
		
		Course[] courses = new Course[]{course1,course2};
				
		for (Course course : courses) {
			System.out.println("Course Id : "+ course.courseId);
			System.out.println("Course Name : "+ course.courseName);
			System.out.println("Course Teacher Name : "+ course.courseTeacherName);
		}
		System.out.println("=========================");
		System.out.println("COURSE ACTIONS INFORMATIONS");
		
		CourseManager courseManager = new CourseManager();
		System.out.println("Courses Added");
		courseManager.add(course1);
		courseManager.add(course2);
		System.out.println("Courses Deleted");
		courseManager.delete(course1);
		courseManager.delete(course2);
		System.out.println("Courses Updated");
		courseManager.update(course1);
		courseManager.update(course2);
		System.out.println("=========================");
		System.out.println("*************************************************************");
		System.out.println("**********************************************************");
		System.out.println("ABOUT TEACHER");
		Teacher teacher = new Teacher(1, "Engin", "Demiroð", "PMP ve ITIL");
		Teacher[] teachers = new Teacher[] {teacher};
		for (Teacher teacherVariable : teachers) {
			System.out.println(teacherVariable.name + teacherVariable.surname+" has "+ teacherVariable.certifies + " certifications");
		}
		System.out.println("=========================");
		System.out.println("TEACHER INFORMATIONS ACTION");
		TeacherManager teacherManager = new TeacherManager();
		teacherManager.showTeacherInfo(teacher);
	}

}
