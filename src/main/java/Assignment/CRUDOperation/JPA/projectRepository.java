package Assignment.CRUDOperation.JPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Assignment.CRUDOperation.DayTasks.Projects;


public interface projectRepository extends JpaRepository<Projects ,Integer> {
	
	List<Projects> findByUsername(String username);

}
