package com.assignee.assignee.repositories;

import com.assignee.assignee.models.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends JpaRepository<Assignee,Long> {
}