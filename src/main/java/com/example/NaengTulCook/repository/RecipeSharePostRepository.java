package com.example.NaengTulCook.repository;

import com.example.NaengTulCook.entity.RecipeSharePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeSharePostRepository extends JpaRepository<RecipeSharePost, Integer> {
}