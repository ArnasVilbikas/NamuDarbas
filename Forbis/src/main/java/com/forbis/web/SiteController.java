package com.forbis.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.forbis.domain.Outcome;
import com.forbis.repository.OutcomeRepository;
import com.forbis.ListInnitiation.TextDecomposition;

@Controller
public class SiteController {

	@Autowired
	private OutcomeRepository outcomeRepo;
	
	@GetMapping("/")
	public String textManipulationGet (ModelMap model){
		List<Outcome> allOutcomes = outcomeRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
		
		Outcome textOutcome = new Outcome();
		
		model.put("allOutcomes", allOutcomes);
		model.put("textOutcome", textOutcome);
		
		return "homepage";
	}
	

	@PostMapping("/")
	public String textManipulationPost (Outcome textOutcome) {
		String arrayOutcomes[];
		String temp = "";
		TextDecomposition textDecomp = new TextDecomposition();
		arrayOutcomes= textDecomp.Setup(textOutcome.getCountedText());

		for ( int i=0; i < arrayOutcomes.length; i++ ){
			temp = temp + arrayOutcomes[i] + " , " + "\n";
        }
		
		textOutcome.setCountedText(temp);
		
		outcomeRepo.save(textOutcome);
		
		
		return "redirect:/Outcomes";
	}
	
	
	@GetMapping("/Outcomes")
	public String OutcomesGet (ModelMap model){
		List<Outcome> allOutcomes = outcomeRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
		
		
		model.put("allOutcomes", allOutcomes);
		
		return "Outcomes";
	}
	
	@PostMapping("/Outcomes")
	public String OutcomesPost (Outcome textOutcome) {
		
		return "redirect:/";
	}
}
