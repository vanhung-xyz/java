package respository;

import model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRespository extends JpaRepository<Member, Integer> {
    Optional<Member> findByUsername(String username);
}
