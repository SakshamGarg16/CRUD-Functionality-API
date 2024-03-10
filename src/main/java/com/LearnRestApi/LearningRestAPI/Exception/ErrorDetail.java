package com.LearnRestApi.LearningRestAPI.Exception;

import java.time.LocalDateTime;

public class ErrorDetail {

	private LocalDateTime TimeStamp;
	private String message;
	private String Detail;

	public ErrorDetail(LocalDateTime timeStamp, String message, String detail) {
		super();
		this.TimeStamp = timeStamp;
		this.message = message;
		this.Detail = detail;
	}

	public LocalDateTime getTimeStamp() {
		return TimeStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetail() {
		return Detail;
	}

}
