package com.assignee.assignee.services;

import com.assignee.assignee.models.Todo;
import com.assignee.assignee.repositories.IToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ToDoServiceImp implements ToDoService{
    private final IToDoRepository iToDoRepository;

    public ToDoServiceImp(IToDoRepository iToDoRepository) {
        this.iToDoRepository = iToDoRepository;
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Todo> findAll() {
        return null;
    }

    @Override
    public List<Todo> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Todo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Todo> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Todo entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Todo> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Todo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Todo> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Todo> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Todo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Todo> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Todo getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Todo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Todo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Todo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Todo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Todo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Todo> boolean exists(Example<S> example) {
        return false;
    }
}
