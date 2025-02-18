package com.example.NaengTulCook.controller;

import com.example.NaengTulCook.dto.RecipeSharePostDTO;
import com.example.NaengTulCook.entity.RecipeSharePost;
import com.example.NaengTulCook.service.RecipeSharePostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/recipe-share")
public class RecipeSharePostController {

    private final RecipeSharePostService recipeSharePostService;

    public RecipeSharePostController(RecipeSharePostService recipeSharePostService) {
        this.recipeSharePostService = recipeSharePostService;
    }

    // 레시피 게시글 등록
    @PostMapping("/posts")
    public ResponseEntity<RecipeSharePost> createPost(@RequestBody RecipeSharePostDTO dto) {
        RecipeSharePost post = recipeSharePostService.createPost(dto);
        return ResponseEntity.status(201).body(post);
    }

    // ID로 레시피 게시글 조회
    @GetMapping("/posts/{id}")
    public ResponseEntity<RecipeSharePost> getPostById(@PathVariable Integer id) {
        Optional<RecipeSharePost> post = recipeSharePostService.getPostById(id);
        return post.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 모든 레시피 게시글 조회 (페이징 적용)
    @GetMapping("/posts")
    public ResponseEntity<?> getAllPosts(@RequestParam int page, @RequestParam int size) {
        return ResponseEntity.ok(recipeSharePostService.getAllPosts(page, size));
    }
}