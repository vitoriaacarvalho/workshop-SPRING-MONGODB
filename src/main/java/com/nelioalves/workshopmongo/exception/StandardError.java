package com.nelioalves.workshopmongo.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long timeStamp;
	private String status;
	private Integer error;
	private String message;
	private String path;
	
	public StandardError() {
	}

	public StandardError(Long timeStamp, String status, Integer error, String message, String path) {
		this.timeStamp = timeStamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getError() {
		return error;
	}

	public void setError(Integer error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
