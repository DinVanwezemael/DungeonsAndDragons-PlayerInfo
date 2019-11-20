package be.thomasmore.playerinfoservice.Repository;

import be.thomasmore.playerinfoservice.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
public interface PlayerRepository extends JpaRepository<Player, Integer> {
//    Player findPlayerById(@Param("id") int id);
}
