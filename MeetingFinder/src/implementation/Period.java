package implementation;

import java.util.Date;

public class Period {
	private Date from;
	private Date to;
	public Date getFrom() {
		return from;
	}
	public Date getTo() {
		return to;
	}
	public Period(Date from, Date to) {
		this.from = from;
		this.to = to;
	}
}
