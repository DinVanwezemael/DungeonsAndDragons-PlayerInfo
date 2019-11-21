package be.thomasmore.playerinfoservice.Repository;

import be.thomasmore.playerinfoservice.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    Player findPlayerByUsername(@Param("username") String username);
    Player findPlayerById(@Param("id") Integer id);
}
//http://localhost:8003/players/search/findPlayerByUsername?username=username1
//http://localhost:8003/players/search/findPlayerById?id=1
