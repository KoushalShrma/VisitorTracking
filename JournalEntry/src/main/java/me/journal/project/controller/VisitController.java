package me.journal.project.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.journal.project.entity.Visit;
import me.journal.project.service.VisitService;

@RestController
@RequestMapping("/visit")
public class VisitController {

	@Autowired
	private VisitService vs;

	@PostMapping
	public Visit addVisitor(@RequestBody Visit v) {
		return vs.addV(v);
	}

	@GetMapping
	public List<Visit> showVisitor(@RequestBody Visit v) {
		return vs.showV(v);
	}

	@PutMapping("/id/{byId}")
	public Visit updateVisitor(@PathVariable Integer byId, @RequestBody Visit v) {
		
		return vs.updateV(byId, v);
	}
	
	@GetMapping("/id/{byId}")
	public Optional<Visit> showVisitorById(@PathVariable Integer byId, @RequestBody Visit v){
		return (Optional<Visit>) vs.showVById(byId);
	}
	
	@DeleteMapping("/id/{byId}")
	public String deleteVisitorById(@PathVariable Integer byId) {
		vs.deleteVById(byId);
		return byId+" Deleted Sucessful!!";
	}
	

}
