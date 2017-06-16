package mtc.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event_severity_downgrade")
public class EventSeverityDowngrade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2345667323423424345L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "source")
	public String source;

	@Column(name = "hostname")
	private String hostname;

	@Column(name = "subsource")
	public String subsource;
	
	@Column(name = "eventid")
	public String eventid;
	
	
	
	protected EventSeverityDowngrade() {
	}

	public EventSeverityDowngrade(String Hostname, String Source) {
		this.hostname = Hostname;
		this.source = Source;
	}

	@Override
	public String toString() {
		return String.format("Maintenance[id=%d, Hostname='%s', Source='%s']", id, hostname, source);
	}
	public String getHostname(){
		return this.hostname;
	}
	
	
}
