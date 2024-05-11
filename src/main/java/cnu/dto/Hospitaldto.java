package cnu.dto;

import java.util.HashMap;

public class Hospitaldto {
	protected int h_id,availBed;
	protected String h_licenceno;
	protected HashMap<String,Integer> availBlood = new HashMap<>();
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public Hospitaldto() {
		this.availBed=0;
		availBlood.put("A+",0);
		availBlood.put("B+",0); 
		availBlood.put("O+",0);
		availBlood.put("A-",0);
		availBlood.put("B-",0);
		availBlood.put("O-",0);
		availBlood.put("AB+",0);
		availBlood.put("AB-",0);
	}
	public int getAvailBed() {
		return availBed;
	}
	public void setAvailBed(int availBed) {
		this.availBed = availBed;
	}
	public String getH_licenceno() {
		return h_licenceno;
	}
	public void setH_licenceno(String h_licenceno) {
		this.h_licenceno = h_licenceno;
	}
	public HashMap<String, Integer> getAvailBlood() {
		return availBlood;
	}
	public void setAvailBlood(String type, int unit) {
		this.availBlood.put(type, unit);
	}
	
}
