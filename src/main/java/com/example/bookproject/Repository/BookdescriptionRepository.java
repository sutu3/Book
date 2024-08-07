package com.example.bookproject.Repository;

import com.example.bookproject.Entity.Bookdescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookdescriptionRepository extends JpaRepository<Bookdescription, Integer>, JpaSpecificationExecutor<Bookdescription> {
}