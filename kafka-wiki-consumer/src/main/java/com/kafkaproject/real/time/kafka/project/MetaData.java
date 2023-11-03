package com.kafkaproject.real.time.kafka.project;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;


public class MetaData {

	private String uri;
	
	private String requestid;
	
	private Date date;
	
	private String title;
	
	private String comment;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getRequestid() {
		return requestid;
	}

	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "MetaData [uri=" + uri + ", requestid=" + requestid + ", date=" + date + ", title=" + title
				+ ", comment=" + comment + "]";
	}
	
	
	
	
	
}
