package in.laxmi.entity;

import java.time.LocalDate;

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
@Table(name = "BI_INFO")
@Getter
@Setter
public class BenefitIssuance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer benefitId;
	private String benefitMonYear;
	private Double benefitAmt;
	private LocalDate transactionDate;
	private String transactionStatus;

	@OneToOne
	@JoinColumn(name = "case_Num")
	private CitizenAppEntity caseNum;

}
