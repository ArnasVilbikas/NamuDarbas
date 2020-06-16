package com.forbis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forbis.domain.Outcome;

//spring-data-jpa in action - lets us execute CRUD(create read update delete) db statements with few lines of code
@Repository
public interface OutcomeRepository extends JpaRepository<Outcome, Long>{

}
