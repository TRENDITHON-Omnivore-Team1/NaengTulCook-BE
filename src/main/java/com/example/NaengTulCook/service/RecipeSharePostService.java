package com.example.NaengTulCook.service;

import com.example.NaengTulCook.dto.RecipeSharePostDTO;
import com.example.NaengTulCook.entity.RecipeSharePost;
import com.example.NaengTulCook.repository.RecipeSharePostRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecipeSharePostService {

    private final RecipeSharePostRepository recipeSharePostRepository;

    public RecipeSharePostService(RecipeSharePostRepository recipeSharePostRepository) {
        this.recipeSharePostRepository = recipeSharePostRepository;
    }

    // 게시글 등록
    public RecipeSharePost createPost(RecipeSharePostDTO dto) {
        RecipeSharePost post = new RecipeSharePost(
                dto.getUserId(),
                dto.getTitle(),
                dto.getDescription(),
                dto.getCategory(),
                dto.getDifficulty(),
                dto.getCookTime(),
                dto.getImageUrl()
        );
        return recipeSharePostRepository.save(post);
    }

    // ID로 게시글 조회
    public Optional<RecipeSharePost> getPostById(Integer id) {
        return recipeSharePostRepository.findById(id);
    }

    // 모든 게시글 조회 (최신순, 페이징)
    public Page<RecipeSharePost> getAllPosts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return recipeSharePostRepository.findAll(pageable);
    }
}
