package space.bum.jsp.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import space.bum.jsp.repo.ItemRepo;

@SpringBootTest
class ItemTest {
  @Autowired
  private ItemRepo itemRepo;
  
  @Test
  void shouldNotAllowToPersistNullItemsPrice() {
    itemRepo.save(new Item());
  }

}
