package fr.eni.applidemo.applidemov1.tpModule4.bo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Repas {
	
	
	private LocalDate dateRepasDate;
	private LocalTime heureDuRepas;
	private String aliments;
	
	
	public Repas() {

	}

	
	public Repas(LocalDate dateRepasDate, LocalTime heureDuRepas, String aliments) {

		this.dateRepasDate = dateRepasDate;
		this.heureDuRepas = heureDuRepas;
		this.aliments = aliments;
	}

	
	public LocalDate getDateRepasDate() {
		return dateRepasDate;
	}

	
	public void setDateRepasDate(LocalDate dateRepasDate) {
		this.dateRepasDate = dateRepasDate;
	}

	
	public LocalTime getHeureDuRepas() {
		return heureDuRepas;
	}

	
	public void setHeureDuRepas(LocalTime heureDuRepas) {
		this.heureDuRepas = heureDuRepas;
	}

	
	public String getAliments() {
		return aliments;
	}

	
	public void setAliments(String aliments) {
		this.aliments = aliments;
	}


	@Override
	public String toString() {
		return "Repas [dateRepasDate=" + dateRepasDate + ", heureDuRepas=" + heureDuRepas + ", aliments=" + aliments
				+ "]";
	}
}
