package in.laxmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laxmi.entity.Plan;

public interface PlanRepositoy extends JpaRepository<Plan, Integer> {

}
