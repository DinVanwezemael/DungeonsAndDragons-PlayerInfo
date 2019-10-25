package be.thomasmore.dd.dungeonsAndDragonsBackend.repository;

import be.thomasmore.dd.dungeonsAndDragonsBackend.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    Player findPlayerByName(@Param("name") String name);
}
