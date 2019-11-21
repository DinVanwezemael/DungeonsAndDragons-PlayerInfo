//package be.thomasmore.playerinfoservice.service;
//
//import be.thomasmore.playerinfoservice.Entity.Player;
//import be.thomasmore.playerinfoservice.Repository.PlayerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PlayerServiceImpl implements PlayerService {
//
//    private PlayerRepository playerRepository;
//
//    @Autowired
//    public PlayerServiceImpl(PlayerRepository playerRepository){
//        this.playerRepository = playerRepository;
//    }
//
//    @Override
//    public List<Player> findAll() {
//        return playerRepository.findAll();
//    }
//
//    @Override
//    public Player findById(int id) {
//        Optional<Player> result = playerRepository.findById(id);
//
//        Player player = null;
//
//        if(result.isPresent()){
//            player = result.get();
//        } else {
//            throw new RuntimeException("Dit not find player id - " + id);
//        }
//
//        return player;
//    }
//
//    @Override
//    @Transactional
//    public void save(Player player) {
//        playerRepository.save(player);
//    }
//
//    @Override
//    @Transactional
//    public void deleteById(int id) {
//        playerRepository.deleteById(id);
//    }
//}
