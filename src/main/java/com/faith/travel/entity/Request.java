package com.faith.travel.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int requestId;
	private String causeTravel;
	private String source;
	private String destination;
	private String mode;
	private LocalDate fromDate;
	private LocalDate toDate;
	private int noDays;
	private String priority;
	private String status;

	@JoinColumn(name = "projectId")
	@ManyToOne
	private Project project;

	@JoinColumn(name = "empId")
	@ManyToOne
	private Employee employee;

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(int requestId, String causeTravel, String source, String destination, String mode,
			LocalDate fromDate, LocalDate toDate, int noDays, String priority, String status, Project project,
			Employee employee) {
		super();
		this.requestId = requestId;
		this.causeTravel = causeTravel;
		this.source = source;
		this.destination = destination;
		this.mode = mode;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noDays = noDays;
		this.priority = priority;
		this.status = status;
		this.project = project;
		this.employee = employee;
	}

	// Getters and setters
	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getCauseTravel() {
		return causeTravel;
	}

	public void setCauseTravel(String causeTravel) {
		this.causeTravel = causeTravel;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public int getNoDays() {
		return noDays;
	}

	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
