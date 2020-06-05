package org.sid.dto;

public class AccidentBusDto {
	private Long busId;
	private Long accidentId;
	
	public Long getBusId() {
		return busId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public Long getAccidentId() {
		return accidentId;
	}
	public void setAccidentId(Long accidentId) {
		this.accidentId = accidentId;
	}
	
	
	public AccidentBusDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccidentBusDto(Long busId, Long accidentId) {
		super();
		this.busId = busId;
		this.accidentId = accidentId;
	}
	
	

}
