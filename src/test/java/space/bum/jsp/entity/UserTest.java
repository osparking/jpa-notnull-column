package space.bum.jsp.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import space.bum.jsp.repo.UserRepo;

@SpringBootTest
class UserTest {
  
  @Autowired
  private UserRepo userRepo;

  @Test
  public void givenUser_whenPersisted_thenOperationSuccessful() {
      UserId userId = new UserId();
      userId.setName("John");
      userId.setLastName("Doe");
      User user = new User(userId, "johndoe@gmail.com");

      userRepo.save(user);

      var userOpt = userRepo.findById(userId);
      user = userOpt.orElse(null);
      assertNotNull(user);
      assertEquals(user.email, "johndoe@gmail.com");
  }

}
