package Com.Org.SpringBoot.MVC.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import Com.Org.SpringBoot.MVC.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	

//	@Query("select u from User u where u.email= :email")
//	public User getUserByName(@RequestParam("email") String email);
	
	   public List<User> findByName(String name);
}
