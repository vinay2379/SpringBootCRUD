package Com.Org.SpringBoot.MVC.Servicess;

import java.util.List;

import Com.Org.SpringBoot.MVC.Model.User;

public interface UserServices {


	public User saveUser(User user) ;
		
	public List<User>  GetAllUser()	;
	
	public User getByID(int id);
	
	public User updateUser(int id , User user);
	
	public String deleteUser(int id);
	
//	public User getByEmail(String email);
}
