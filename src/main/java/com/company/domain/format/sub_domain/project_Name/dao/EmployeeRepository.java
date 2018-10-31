package com.company.domain.format.sub_domain.project_Name.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pavan Yalamanchili
 *
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}