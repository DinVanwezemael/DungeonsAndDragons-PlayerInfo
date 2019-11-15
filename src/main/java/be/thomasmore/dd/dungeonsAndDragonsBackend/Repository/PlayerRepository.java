package be.thomasmore.dd.dungeonsAndDragonsBackend.Repository;

import be.thomasmore.dd.dungeonsAndDragonsBackend.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    Player findPlayerById(@Param("id") int id);
}
