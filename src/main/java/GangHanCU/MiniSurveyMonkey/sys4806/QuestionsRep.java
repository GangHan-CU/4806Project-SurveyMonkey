package GangHanCU.MiniSurveyMonkey.sys4806;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="question", path="question")
public interface QuestionsRep extends JpaRepository<Questions, Integer>{
}
