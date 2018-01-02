package open.bar.demo.repository;

import open.bar.demo.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Integer> {
    Tipo findById(int id);
}
