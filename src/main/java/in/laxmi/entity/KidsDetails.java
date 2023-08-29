package in.laxmi.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DC_CHILDREN")
@Getter
@Setter
public class KidsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer childId;
	private String childName;
	private LocalDate dob;
	private String child_ssn;
	@ManyToOne
	@JoinColumn(name = "case_Num")
	private CitizenAppEntity casekNum;

}
