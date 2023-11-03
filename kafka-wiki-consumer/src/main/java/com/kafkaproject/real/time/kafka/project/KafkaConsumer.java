package com.kafkaproject.real.time.kafka.project;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;



@Service
public class KafkaConsumer {

	
	@Autowired
	private MetaDatas datas;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(KafkaConsumer.class);

	
	


	@KafkaListener(topics="wiki_recentchange", groupId="mygroup")
	public void consume(String message) throws FileNotFoundException, JAXBException {
	//	LOGGER.info(String.format("message recieved -> %s",message));
	
		WikiData data= new WikiData();
		data.setWikidata(message);
		JsonObject jsonObject = new JsonParser().parse(data.getWikidata()).getAsJsonObject();
		LOGGER.info(jsonObject.get("title").toString());
		LOGGER.info(jsonObject.get("title_url").toString());
		LOGGER.info(jsonObject.get("comment").toString());
	
		MetaData metadata= new MetaData();		
     	metadata.setUri(jsonObject.get("title_url").toString());
		metadata.setComment(jsonObject.get("comment").toString());
		metadata.setTitle(jsonObject.get("title").toString());
		//metadata.setDate(je.get("dt").toString());
			
		ArrayList<MetaData> m=new ArrayList<MetaData>();
		m.add(metadata);
		datas.setMetadatas(m);
		 JAXBContext contextObj = JAXBContext.newInstance(MetaDatas.class);  
		 Marshaller marshallerObj = contextObj.createMarshaller();  
		 marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
		 marshallerObj.marshal(datas, new File("./met.xml"));  
		 System.out.println(metadata);


		
		
		
		//System.out.println(jsonObject);
		
	//	repository.save(data);
		
	
		
	}
	
}
