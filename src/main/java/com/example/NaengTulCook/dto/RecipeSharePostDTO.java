package com.example.NaengTulCook.dto;

public class RecipeSharePostDTO {
    private Integer userId;  // 사용자 ID 추가
    private String title;
    private String description;
    private String category;
    private int difficulty;
    private int cookTime;
    private String imageUrl;

    // 기본 생성자
    public RecipeSharePostDTO() {}

    // 생성자
    public RecipeSharePostDTO(Integer userId, String title, String description, String category, int difficulty, int cookTime, String imageUrl) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.difficulty = difficulty;
        this.cookTime = cookTime;
        this.imageUrl = imageUrl;
    }

    // Getter & Setter
    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getDifficulty() { return difficulty; }
    public void setDifficulty(int difficulty) { this.difficulty = difficulty; }

    public int getCookTime() { return cookTime; }
    public void setCookTime(int cookTime) { this.cookTime = cookTime; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
