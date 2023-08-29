package in.laxmi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DC_EDUCATION")
@Getter
@Setter
public class EducationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	private String heighestDegree;
	private String graduationYear;
	private String university;

	@OneToOne
	@JoinColumn(name = "case_Num")
	private CitizenAppEntity caseeNum;
}
