package springBootproject.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import springBootproject.Person;
 
public interface PersonRepository extends Neo4jRepository<Person, Long>{

}
