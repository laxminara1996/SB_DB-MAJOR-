package in.laxmi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DC_PLAN_SELECTION")
@Getter
@Setter
public class PlanSelection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer planSelectionId;
	@OneToOne
	@JoinColumn(name = "case_Num")
	@JsonBackReference
	private CitizenAppEntity casepNum;
	@OneToOne
	@JoinColumn(name = "plan_Id")
	@JsonBackReference
	private CitizenAppEntity cplanId;
	
}
