package be.thomasmore.playerinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerServiceApplication {
//	private static Logger log = LoggerFactory.getLogger(PlayerServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PlayerServiceApplication.class, args);
	}

//	@RequestMapping(value = "/")
//	public String home() {
//		log.info("Access /(niets dus hi)");
//		return "Hi!PLAYER SERVICE";
//	}
}
