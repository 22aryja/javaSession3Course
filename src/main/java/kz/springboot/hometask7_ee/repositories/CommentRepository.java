package kz.springboot.hometask7_ee.repositories;

import kz.springboot.hometask7_ee.entities.Comments;
import kz.springboot.hometask7_ee.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CommentRepository extends JpaRepository<Comments, Long> {
}
