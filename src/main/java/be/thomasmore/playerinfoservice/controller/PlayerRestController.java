//package be.thomasmore.playerinfoservice.controller;
//
//import be.thomasmore.playerinfoservice.Entity.Player;
//import be.thomasmore.playerinfoservice.service.PlayerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/playerController")
//public class PlayerRestController {
//
//    private PlayerService playerService;
//
//    @Autowired
//    public PlayerRestController(PlayerService playerService){
//        this.playerService = playerService;
//    }
//
//    @GetMapping("/players")
//    public List<Player> findAll(){
//        return  playerService.findAll();
//    }
//
//    @GetMapping("/players/{playerId}")
//    public Player getPlayer(@PathVariable int playerId){
//        Player player = playerService.findById(playerId);
//
//        if(player == null){
//            throw new RuntimeException("Player id not found - " + playerId);
//        }
//
//        return player;
//    }
//
//    @PostMapping("/players")
//    public Player addPlayer(@RequestBody Player player){
//        player.setId(0);
//        playerService.save(player);
//        return  player;
//    }
//
//    @PutMapping("/players")
//    public Player updatePlayer(@RequestBody Player player){
//        playerService.save(player);
//        return  player;
//    }
//
//    @DeleteMapping("/players/{playerId}")
//    public String deletePlayer(@PathVariable int playerId){
//        Player player = playerService.findById(playerId);
//
//        if(player == null){
//            throw new RuntimeException("Player id not found - " + playerId);
//        }
//
//        playerService.deleteById(playerId);
//        return  "delete playerId - " + playerId;
//    }
//
//}
//
//
