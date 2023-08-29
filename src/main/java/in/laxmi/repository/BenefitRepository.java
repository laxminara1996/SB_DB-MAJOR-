package in.laxmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laxmi.entity.BenefitIssuance;

public interface BenefitRepository extends JpaRepository<BenefitIssuance, Integer>{

}
