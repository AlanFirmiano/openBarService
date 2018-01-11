package open.bar.demo.repository;

import open.bar.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    Item findById(int id);

    @Query("from Item order by preco")
    List<Item> findAllByQuantidadeNotNull();
}
