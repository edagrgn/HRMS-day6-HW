package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data

@Entity
@Table(name = "positions")
public class Position {
	
	
	@Id
	@GeneratedValue
	@Column(name="position_id")
	private int id;

	@Column(name="position_name")
	private String positionName;
	
	
	public Position(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}
	
	public Position() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPositionName() {
		return positionName;
	}


	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	

}
