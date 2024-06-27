package space.bum.jsp.repo;

import org.springframework.data.repository.CrudRepository;

import space.bum.jsp.entity.Item;

public interface ItemRepo extends CrudRepository<Item, Long> {

}
