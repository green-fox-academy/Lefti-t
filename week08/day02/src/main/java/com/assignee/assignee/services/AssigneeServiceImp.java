package com.assignee.assignee.services;

import com.assignee.assignee.models.Assignee;
import com.assignee.assignee.repositories.AssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssigneeServiceImp implements AssigneeService {

    AssigneeRepository assigneeRepository;

    public AssigneeServiceImp(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }


    @Override
    public List<Assignee> findAll() {
        return this.assigneeRepository.findAll();
    }

    @Override
    public void save(String name, String email) {
        Assignee assignee = new Assignee(name,email);
        this.assigneeRepository.save(assignee);
    }

    @Override
    public List<Assignee> getAllAssignees() {
        return this.assigneeRepository.findAll();
    }

    @Override
    public void deleteAssignee(Long id) {
        this.assigneeRepository.deleteById(id);
    }

    @Override
    public Assignee getAssignee(Long id) {
        return this.assigneeRepository.getOne(id);
    }

    @Override
    public void updateAssignee(Long id, String name, String email) {
        Assignee assignee = new Assignee(name,email);
        assignee.setId(id);
        this.assigneeRepository.save(assignee);
    }


    @Override
    public List<Assignee> search(String name) {
        return this.assigneeRepository
                .findAll()
                .stream()
                .filter(search -> search.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}