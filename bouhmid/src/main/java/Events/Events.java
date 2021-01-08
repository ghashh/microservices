package Events;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Events {

private static final long serialVersionUID = 795450928237931201L;
	
	@Id
	@GeneratedValue
	private long id;
	private String titre_event;
	private String description_event ;
	private LocalDate start;
	private Date end ;

	
	public long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = l;
	}



	public String getTitre_event() {
		return titre_event;
	}

	public void setTitre_event(String titre_event) {
		this.titre_event = titre_event;
	}

	public String getDescription_event() {
		return description_event;
	}

	public void setDescription_event(String description_event) {
		this.description_event = description_event;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Events(int id,String a, String b,Date d) {
		this.id = id ;
		this.titre_event=a ;
		this.description_event = b;
		this.end = d;
	}
	
	public Events(String a, String b ){
		super();
		this.titre_event=a ;
		this.description_event = b;
	
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

