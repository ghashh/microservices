package Events;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface EventsRepository extends JpaRepository<Events, Integer> {

	@Query("select c from Events c where c.id like :id")
	public Page<Events> EventByNom(@Param("id") String n, Pageable pageable);
	
	
	
}
