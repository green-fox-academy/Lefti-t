package com.trial.exam.repositories;

import com.trial.exam.models.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url,Long> {

    Url findUrlByAlias(String alias);
    Url findUrlBySecretCode(Integer secretCode);

}
