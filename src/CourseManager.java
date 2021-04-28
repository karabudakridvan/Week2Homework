
public class CourseManager {
	public void add(Course course) {
		System.out.println("New Course has been added: "+course.courseName);
	}
	
	public void update(Course course) {
		System.out.println("Course updated: "+course.courseName);
	}
	
	public void delete(Course course) {
		System.out.println("Course deleted: "+course.courseName);
	}
}
