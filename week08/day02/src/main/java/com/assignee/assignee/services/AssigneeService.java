package com.assignee.assignee.services;

import com.assignee.assignee.models.Assignee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AssigneeService {


    List<Assignee> findAll();


    void save(String title, String email);

    List<Assignee> getAllAssignees();

    void deleteAssignee(Long id);

    Assignee getAssignee(Long id);

    void updateAssignee(Long id, String name,String email);

    List<Assignee> search(String search);
}