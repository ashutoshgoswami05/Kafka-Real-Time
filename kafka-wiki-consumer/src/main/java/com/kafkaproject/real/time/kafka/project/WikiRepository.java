package com.kafkaproject.real.time.kafka.project;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiRepository extends CrudRepository<WikiData,Long> {

}
