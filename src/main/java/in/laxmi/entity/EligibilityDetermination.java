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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ED_ELIG_DTLS")
@Getter
@Setter
public class EligibilityDetermination {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer edTraceId;
private String planName;
private String planStatus;
private LocalDate eligStartDate;
private LocalDate eligEndDate;
private Double benefitAmt;
private String denialReason;
@CreationTimestamp
@Column(updatable=false)
private LocalDate createdDate;

@OneToOne
@JsonBackReference
private Correspondence Correspondence;
	
@OneToOne
@JoinColumn(name = "case_Num")
private CitizenAppEntity caseelNum;
	
}
