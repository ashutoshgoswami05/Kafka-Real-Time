package com.kafkaproject.real.time.kafka.project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;


@Entity
@Table(name="wikidata")

public class WikiData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Lob
	private String wikidata;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWikidata() {
		return wikidata;
	}
	public void setWikidata(String wikidata) {
		this.wikidata = wikidata;
	}
	
	
}
