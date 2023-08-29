package in.laxmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laxmi.entity.IncomeDetails;

public interface IncomeDetailsRepository extends JpaRepository<IncomeDetails, Integer> {

}
