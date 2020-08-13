package com.assignee.assignee.repositories;

import com.assignee.assignee.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToDoRepository extends JpaRepository<Todo, Long> {

    //CUSTOM JPA QUERY
   // @Query("SELECT c FROM Todo c where c.owner.age> :age")
  //  List<Car> findAllByTitleContentDescriptionCustomQuery(String age);
}
