package Assignment.CRUDOperation.DayTasks;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Projects {

	public Projects() {

	}

	public Projects(Integer id, String username, String description, LocalDate targetDate,LocalDate StartDate,LocalDate EndDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	@Id
	@GeneratedValue
	private Integer id;

	private String username;
	private String description;
	private LocalDate targetDate;
	@NotNull(message = "Start date can't be blank")
	private LocalDate StartDate;
	private LocalDate EndDate;
	private boolean done;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	

	public LocalDate getStartDate() {
		return StartDate;
	}

	public void setStartDate(LocalDate startDate) {
		StartDate = startDate;
	}

	public LocalDate getEndDate() {
		return EndDate;
	}

	public void setEndDate(LocalDate endDate) {
		EndDate = endDate;
	}

	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", done=" + done + "]";
	}

}