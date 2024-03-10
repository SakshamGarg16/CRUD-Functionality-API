package Assignment.CRUDOperation.DayTasks;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class idNotFound extends RuntimeException {

	public idNotFound(String message) {
		super(message);
	}

}

