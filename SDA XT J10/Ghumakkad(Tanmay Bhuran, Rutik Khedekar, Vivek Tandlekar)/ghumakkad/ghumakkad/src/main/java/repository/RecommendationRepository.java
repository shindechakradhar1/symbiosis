package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Recommendation;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {}
