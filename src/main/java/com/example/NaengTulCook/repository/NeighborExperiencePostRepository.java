//package com.example.NaengTulCook.repository;
//
//import com.example.NaengTulCook.entity.NeighborExperiencePost;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface NeighborExperiencePostRepository extends JpaRepository<NeighborExperiencePost, Integer> {
//}

package com.example.NaengTulCook.repository;

import com.example.NaengTulCook.entity.NeighborExperiencePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NeighborExperiencePostRepository extends JpaRepository<NeighborExperiencePost, Integer> {
    List<NeighborExperiencePost> findAllByOrderByCreatedAtDesc(); // 최신순 정렬
    List<NeighborExperiencePost> findAllByOrderByLikeCountDesc(); // 인기순 정렬
}