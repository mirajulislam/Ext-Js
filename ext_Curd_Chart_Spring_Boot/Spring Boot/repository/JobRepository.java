package SpringBoot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBoot.entites.Job;


@Repository
public interface JobRepository extends JpaRepository<Job,Integer>{

}
