package it.polito.tdp.lab04.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;

public class Model {
	
	private CorsoDAO cDAO;
	
	public List<String> getListaCorsi(){
		List<String> nomiCorsi = new ArrayList<String>();
		for(Corso c : cDAO.getTuttiICorsi())
			if(!nomiCorsi.contains(c.getCodins()))
				nomiCorsi.add(c.getNome());
		return nomiCorsi;
	}
	
	
}
