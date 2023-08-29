package in.laxmi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="CO_NOTICES")
@Getter
@Setter
public class Correspondence {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer noticeId;
private String coPfUrl;
private LocalDate printDate;
private String noticeStatus="Y";
@CreationTimestamp
@Column(updatable=false)
private LocalDate createdDate;

@OneToOne
@JoinColumn(name = "case_Num")
private CitizenAppEntity caseNum;

@OneToOne
@JoinColumn(name = "edTrace_Id")
private EligibilityDetermination eligTraceId;
	 
}
