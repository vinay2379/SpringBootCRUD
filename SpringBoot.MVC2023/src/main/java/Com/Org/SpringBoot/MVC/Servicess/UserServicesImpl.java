package Com.Org.SpringBoot.MVC.Servicess;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Org.SpringBoot.MVC.Model.User;
import Com.Org.SpringBoot.MVC.Repository.UserRepository;
@Service
public class UserServicesImpl implements UserServices{
	@Autowired
    private UserRepository repo;
	
//_____________________________________________________________________________	
	@Override
	public User saveUser(User user) {
		this.repo.save(user);

		return user;
	}
//_____________________________________________________________________________

	@Override
	public List<User> GetAllUser() {
		
		return this.repo.findAll();
	}
//_____________________________________________________________________________

	@Override
	public User getByID(int id) {
		
	Optional<User>	o=this.repo.findById(id);
		
		return o.get();
	}
//_______________________________________________________________________________

	@Override
	public User updateUser(int id ,User user) {
		Optional<User>	o=this.repo.findById(id);
		User u=o.get();
		u.setName(user.getName());
		u.setEmail(user.getEmail());
		u.setPassword(user.getPassword());
		u.setPhone(user.getPhone());
		u.setSal(user.getSal());
		this.repo.save(u);
		return u;
	}

//______________________________________________________________________________
	@Override
	public String deleteUser(int id) {
		 
		this.repo.deleteById(id);
		
		return "deleted id : "+id;
	}

//	@Override
//	public List<User> getByEmail(String name) {
//		// TODO Auto-generated method stub
//		return this.repo.findByName(name);
//	}

}
