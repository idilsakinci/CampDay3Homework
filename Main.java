package campday3homework;

public class Main {

    public static void main(String[] args) {
        
        StudentUser student1 = new StudentUser();
        student1.setId(1);
	student1.setFirstName("İdil");
	student1.setLastName("Sakıncı");
	student1.setEmail("idilsakincii6@gmail.com");
        student1.setPassword("1234");
        student1.setCourseTaken("JAVA");
        
        InstructorUser instructor1 = new InstructorUser();
        instructor1.setId(2);
	instructor1.setFirstName("Engin");
	instructor1.setLastName("Demiroğ");
	instructor1.setEmail("engindemirog@gmail.com");
        instructor1.setPassword("1234");
        instructor1.setCourseGiven("JAVA");
        
        StudentUserManager studentUserManager = new StudentUserManager();
	studentUserManager.add(student1);		
	InstructorUserManager instructorUserManager = new InstructorUserManager();
	instructorUserManager.add(instructor1);

        UserManager userManager = new UserManager();
        User[] users={student1, instructor1};      
        
        System.out.println(student1.getCourseTaken());
        System.out.println(instructor1.getCourseGiven());
    
    }
    
}
