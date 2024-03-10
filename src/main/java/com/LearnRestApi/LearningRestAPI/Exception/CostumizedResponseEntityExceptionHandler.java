package com.LearnRestApi.LearningRestAPI.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import Assignment.CRUDOperation.DayTasks.idNotFound;

@ControllerAdvice
public class CostumizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetail> CoshandleException(Exception ex, WebRequest request) throws Exception {

		ErrorDetail errordetail = new ErrorDetail(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));

		return new ResponseEntity<>(errordetail, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(idNotFound.class)
	public final ResponseEntity<ErrorDetail> CoshandleExceptionuser(Exception ex, WebRequest request) throws Exception {

		ErrorDetail errordetail = new ErrorDetail(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));

		return new ResponseEntity<>(errordetail, HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		ErrorDetail errordetail = new ErrorDetail(LocalDateTime.now(),
				" Total errors: " + ex.getErrorCount() + ":- First error =" + ex.getFieldError().getDefaultMessage(),
				request.getDescription(false));

		return new ResponseEntity(errordetail, HttpStatus.BAD_REQUEST);
	}

}
