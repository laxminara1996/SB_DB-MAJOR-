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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IES_USERS")
@Setter
@Getter
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String fullName;
	private String userMail;
	private String pwd;
	private Long userPhno;
	private String gender;
	private LocalDate dob;
	private String userssn;
	private String activeSw = "ACTIVE";
	private String accStatus = "LOCKED";
	private Integer userRole;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;

	private Integer createdBy;
	private Integer updateBy;
	@OneToMany(mappedBy="useruId",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Plan>  plans;
	@OneToMany(mappedBy="usercId")
	@JsonBackReference
	private List<CitizenAppEntity>  citizensData;

}
