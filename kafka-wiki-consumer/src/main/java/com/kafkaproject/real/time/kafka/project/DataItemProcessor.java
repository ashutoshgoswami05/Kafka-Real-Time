package com.kafkaproject.real.time.kafka.project;

import org.springframework.batch.item.ItemProcessor;

public class DataItemProcessor implements ItemProcessor<MetaData,MetaData>{  




@Override
public MetaData process(MetaData item) throws Exception {
	// TODO Auto-generated method stub
	return item;
}
}