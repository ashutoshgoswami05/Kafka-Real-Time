package com.kafkaproject.real.time.kafka.project;


import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.xml.bind.annotation.XmlElement;
@jakarta.xml.bind.annotation.XmlRootElement(name = "MetaData")
@Component
public class MetaDatas {
	private List<MetaData> metadatas;

	public List<MetaData> getMetadatas() {
		return metadatas;
	}

	@XmlElement(name = "metadata")
	public void setMetadatas(List<MetaData> metadatas) {
		this.metadatas = metadatas;
	}

	
	
	
	
}





