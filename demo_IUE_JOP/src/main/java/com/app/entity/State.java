package com.app.entity;


import java.util.Objects;



import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class State {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO , generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	
	private  Long id;
	private String stateName;
	private String description;
	
	public State() {}


	public State(Long id, String stateName, String description) {
		super();
		this.id = id;
		this.stateName = stateName;
		this.description = description;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(this == o) return true;
		if(o == this || getClass() != o.getClass()) return false;
		
		State state = (State) o;
		
		return Objects.equals(id, state.id) &&
				Objects.equals(stateName, state.stateName) &&
				Objects.equals(description, state.description);
		
		
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(id, stateName, description);
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "State [id=" + id + ", stateName=" + stateName + ", description=" + description + "]";
	}


	
	
	
}
