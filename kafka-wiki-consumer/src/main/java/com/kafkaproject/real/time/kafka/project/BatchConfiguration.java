//package com.kafkaproject.real.time.kafka.project;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.item.xml.StaxEventItemWriter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.WritableResource;
//import org.springframework.oxm.xstream.XStreamMarshaller;
//
//@Configuration
//@EnableBatchProcessing
//public class BatchConfiguration {
//	
//	@Autowired
//	private JobBuilderFactory jobBuilderFactory;
//	
//	@Autowired
//	private StepBuilderFactory stepBuilderFactory;
//	
//	@Bean 
//	public DataItemProcessor processor() {
//		return new DataItemProcessor();
//	}
//	
//	
//	@Bean
//	public StaxEventItemWriter<MetaData> writer(){
//		StaxEventItemWriter<MetaData> writer= new StaxEventItemWriter<MetaData>();
//		writer.setResource((WritableResource) new ClassPathResource("MetaData.xml"));
//		Map<String,String> aliasesMap= new HashMap<String,String>();
//		XStreamMarshaller marshaller= new XStreamMarshaller();
//		writer.setMarshaller(marshaller);
//		writer.setRootTagName("MetaData");
//		writer.setOverwriteOutput(true);
//		return writer;
//		
//	}
//	
////	@Bean
////	public Step step1() {
////		return stepBuilderFactory.get("Step1").<MetaData,MetaData>chunk(10).reader(reader());
////	}
////	
//	
//	
//
//}
