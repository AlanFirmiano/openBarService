package open.bar.demo.repository;

import open.bar.demo.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Integer> {

}
