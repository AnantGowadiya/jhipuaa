package com.jhipster.qoutes.repository;
import com.jhipster.qoutes.domain.Quote;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Quote entity.
 */
@SuppressWarnings("unused")
@Repository
public interface QuoteRepository extends MongoRepository<Quote, String> {

}
