package campday3homework;

public class UserManager {
    
    public void add(User user) {
        System.out.println("Kullanıcı kaydedildi: " +user.getEmail());
    }
    
    public void addMultiple(User[] users) {
        for(User user : users) {
            add(user);
        }
    }
    
    public void login(User user) {
	System.out.println(user.getEmail() + "Hesaba giriş yapıldı.");
	}
	
    public void logout(User user) {
	System.out.println(user.getEmail()+ "Hesaptan çıkış yapıldı.");
    }
    
}
