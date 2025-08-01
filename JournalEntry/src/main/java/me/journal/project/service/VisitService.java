package me.journal.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.journal.project.entity.Visit;
import me.journal.project.repository.VisitRepository;

@Service
public class VisitService {

	@Autowired
	private VisitRepository vr;

	public Visit addV(Visit v) {
		vr.save(v);
		return v;
	}

	public List<Visit> showV(Visit v) {
		return vr.findAll();
	}

	public Visit updateV(Integer byId, Visit v) {
		Visit existingVisit = vr.findById(byId)
				.orElseThrow(() -> new RuntimeException("Visit not found with id: " + byId));
		
		existingVisit.setvName(v.getvName());
		existingVisit.setvEmail(v.getvEmail());
		existingVisit.setvReason(v.getvReason());
		return vr.save(existingVisit);

	}

	public Optional<Visit> showVById(Integer byId) {
		
		return vr.findById(byId);
	}

	public void deleteVById(Integer byId) {
//		Visit findId = vr.getById(byId);
		vr.deleteById(byId);
	}

}
