package warehouse.dvl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import warehouse.dvl.models.Item;

@Repository("WHRepo")
public interface WarehouseRepository extends JpaRepository<Item, Long> {

}
