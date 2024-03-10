package Assignment.CRUDOperation.DayTasks;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import Assignment.CRUDOperation.JPA.projectRepository;
import jakarta.validation.Valid;



@RestController
public class projectController {

	@Autowired
	private projectRepository todoo;

	@GetMapping("/projects/{UserName}")
	public List<Projects> RetriveTodos(@PathVariable String UserName) {
		return todoo.findByUsername(UserName);

	}

	@GetMapping("/projects/{UserName}/{id}")
	public Projects RetriveSpecificTodos(@PathVariable String UserName, @PathVariable int id) {
		return todoo.findById(id).get();

	}

	@DeleteMapping("/projects/{UserName}/{id}")
	public ResponseEntity<Void> DeleteSpecificTodos(@PathVariable String UserName, @PathVariable int id) {
		todoo.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/projects/{UserName}/{id}")
	public Projects updateTodos(@PathVariable String UserName, @PathVariable int id, @ModelAttribute("Projects") @Valid Projects project) {
		todoo.save(project);
		return project;
	}

	@PostMapping("/projects/{UserName}")
	public Projects addTodos(@PathVariable String UserName, @ModelAttribute("Projects") @Valid Projects project) {
		project.setUsername(UserName);
		project.setId(null);
		return todoo.save(project);
	}
}
