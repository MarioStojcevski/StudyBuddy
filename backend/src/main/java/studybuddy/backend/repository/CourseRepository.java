package studybuddy.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import studybuddy.backend.models.Course;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
