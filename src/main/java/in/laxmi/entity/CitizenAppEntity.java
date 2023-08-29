package in.laxmi.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="IES_APPS")
@Getter
@Setter
public class CitizenAppEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer caseNum;
private String fullName;
private String email;
private LocalDate dob;
private String ssn;
private String stateName;
private String cityName;
private String houseNum;
private Integer createdBy;
@CreationTimestamp
private LocalDate createdDate;
@ManyToOne
@JoinColumn(name="user_Id")
@JsonBackReference
private Users usercId;
@OneToOne(mappedBy="casepNum",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JsonBackReference
private PlanSelection  planselect;
@OneToOne(mappedBy="casiNum",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JsonBackReference
private IncomeDetails  incomeData;
@OneToOne(mappedBy="caseeNum",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JsonBackReference
private EducationDetails  educationData;
@OneToMany
@JsonBackReference
private List<KidsDetails>  kidsData;

@OneToOne(mappedBy="caseelNum",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JsonBackReference
private EligibilityDetermination  eligibilityDetermination;
}
