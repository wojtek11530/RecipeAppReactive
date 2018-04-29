package com.wojtek11530.repositories.reactive;

import com.wojtek11530.domain.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String>{
    Mono<UnitOfMeasure> findByDescription(String description);
}
