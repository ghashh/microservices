package Events;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class EventApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);

	}
	
	@Autowired
	private EventsRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			Events m = new Events(2,"ahli","med",new Date());
			Events did= new Events(3,"ahmed","med",new Date());
			// save			
			repository.save(m);
			repository.save(did);
			// fetch
			repository.findAll().forEach(System.out::println);
		//repository.delete(m);
			// repository.deleteAll();

		};
	}

}
