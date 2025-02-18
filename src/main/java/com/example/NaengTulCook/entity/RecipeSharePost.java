package com.example.NaengTulCook.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "recipe_share_post")
public class RecipeSharePost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer userId; // 유저 ID

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length = 500)
    private String description;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int difficulty;

    @Column(nullable = false)
    private int cookTime;

    @Column
    private String imageUrl;

    @Column(nullable = false)
    private int likeCount = 0; // 좋아요 개수

    @Column(nullable = false)
    private int commentCount = 0; // 댓글 개수

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date createdAt = new Date();

    public RecipeSharePost() {}

    public RecipeSharePost(Integer userId, String title, String description, String category, int difficulty, int cookTime, String imageUrl) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.difficulty = difficulty;
        this.cookTime = cookTime;
        this.imageUrl = imageUrl;
    }

    // Getter & Setter
    public Integer getId() { return id; }
    public Integer getUserId() { return userId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public int getDifficulty() { return difficulty; }
    public int getCookTime() { return cookTime; }
    public String getImageUrl() { return imageUrl; }
    public int getLikeCount() { return likeCount; }
    public int getCommentCount() { return commentCount; }
    public Date getCreatedAt() { return createdAt; }

    public void setLikeCount(int likeCount) { this.likeCount = likeCount; }
    public void setCommentCount(int commentCount) { this.commentCount = commentCount; }
}