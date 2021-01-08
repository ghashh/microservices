package Events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventService {
	@Autowired
	private EventsRepository EventsRepository;

	public Events addEvent(Events c) {
		return EventsRepository.save(c);
	}
	
	public Events updateEvent(int id, Events n) {
		if (EventsRepository.findById(id).isPresent()) {
			Events existingEvent = EventsRepository.findById(id).get();
			existingEvent.setId(n.getId());
			existingEvent.setTitre_event(n.getTitre_event());
			existingEvent.setDescription_event(n.getDescription_event());
			existingEvent.setStart(n.getStart());
			existingEvent.setEnd(n.getEnd());

			return EventsRepository.save(existingEvent);
		} else
			return null;
	}
	
	public String deleteEvent(int id) {
		if (EventsRepository.findById(id).isPresent()) {
			EventsRepository.deleteById(id);
			return "Event supprimé";
		} else
			return "Event non supprimé";
	}
	
}
