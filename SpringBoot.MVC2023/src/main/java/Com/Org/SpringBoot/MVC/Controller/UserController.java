package Com.Org.SpringBoot.MVC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.Org.SpringBoot.MVC.Model.User;
import Com.Org.SpringBoot.MVC.Servicess.UserServices;

@RestController
@RequestMapping("/User/API")
public class UserController {
    @Autowired
	private UserServices ss;
//___________________________________________________________________________________	
	@PostMapping("/saveUser")
	public User SaveUser(@RequestBody User user) {
		
		user=this.ss.saveUser(user);
		
		return user;
		
	}
//________________________________________________________________________________
	@GetMapping("/getAll")
	public List<User> getAll(){
		
		return this.ss.GetAllUser();
	}
	
//_____________________________________________________________________________
	
	@GetMapping("/getById/{id}")
	public User getById(@PathVariable Integer id){
		
		return this.ss.getByID(id);
	}
//________________________________________________________________________________
	@PutMapping("/update/{id}")
	public User update(@PathVariable Integer id, @RequestBody User user) {
		
		
		return this.ss.updateUser(id, user);
	}
//___________________________________________________________________________
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		
		this.ss.deleteUser(id);
		return "deleted Id : "+id;
	}
//______________________________________________________________________________---	
//	@GetMapping("/getByName")
//	public User getByName(@RequestBody   String email) {
//		User user=this.ss.getByEmail(email);
//		
//		
//		return user;
//	}
}
