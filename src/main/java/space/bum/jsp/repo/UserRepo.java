package space.bum.jsp.repo;

import org.springframework.data.repository.CrudRepository;

import space.bum.jsp.entity.User;
import space.bum.jsp.entity.UserId;

public interface UserRepo extends CrudRepository<User, UserId>{

}
