package GangHanCU.MiniSurveyMonkey.sys4806;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="survey", path="survey")
public interface SurveyRep extends JpaRepository<Surveys, Integer>{
    Surveys findByName(@Param("name") String name);
}
