package respository;

import model.Vihicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VihicleRespository extends JpaRepository<Vihicle, Integer> {
}
