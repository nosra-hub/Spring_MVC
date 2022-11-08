package tn.enig.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import tn.eng.model.Affectation;
import tn.eng.model.Enseignant;
import tn.eng.model.Matiere;
import tn.enig.dao.GestionImp;
import tn.enig.dao.Igestion;


@Controller
public class AppController {
	
	@Autowired

	 Igestion dao ;


	@GetMapping(path="/page1")
	public String getHome(Model m) {
		List<Matiere>liste=dao.getallMatiere();
		m.addAttribute("liste",liste);
		return "page1";
		
}
	@GetMapping(path="/ens")
	public String getens(Model m) {
		List<Enseignant>list=dao.getallEnseignant();
		m.addAttribute("list",list);
		return "ens";
		
}
	/********ADD MATIERE **********/
	@PostMapping("/addMatiere")
	public String addmat(Model m) {	
		Matiere mat = new Matiere();
		
		m.addAttribute("matiere", mat);
		return "addMatiere";
	}
	/********************* add 
	/*****DELETE*********/
	
	/*@GetMapping("/delete/{id}")
public void del(@PathVariable("id") int id){    
    dao.deleteAff(id);*/
}
