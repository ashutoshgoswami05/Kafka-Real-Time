package org.kafka.producer.wiki;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;

@Service
public class WikiChangeProducer {
	public static Logger logger=LoggerFactory.getLogger(WikiChangeProducer.class);
	
	private KafkaTemplate<String,String> kafkatemplate;

	public WikiChangeProducer(KafkaTemplate<String, String> kafkatemplate) {
		
		this.kafkatemplate = kafkatemplate;
	}
	
	public void sendMessage() throws InterruptedException {
			String topic="wiki_recentchange";
			
				EventHandler eventHandler=new WikiChangeHandler(kafkatemplate,topic);
	
				String url="https://stream.wikimedia.org/v2/stream/mediawiki.recentchange";
				
				EventSource.Builder builder= new EventSource.Builder(eventHandler,URI.create(url));
	
			EventSource eventSource=builder.build();	
			
			eventSource.start();
			TimeUnit.MINUTES.sleep(10);
	
	}
	
	
	
}
