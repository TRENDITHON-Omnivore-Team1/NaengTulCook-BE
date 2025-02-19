//package com.example.NaengTulCook.dto;
//
//public class NeighborExperiencePostDTO {
//    private int userId;
//    private String title;
//    private String content;
//
//    // 기본 생성자
//    public NeighborExperiencePostDTO() {}
//
//    // 생성자
//    public NeighborExperiencePostDTO(int userId, String title, String content) {
//        this.userId = userId;
//        this.title = title;
//        this.content = content;
//    }
//
//    // Getter & Setter
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//}


package com.example.NaengTulCook.dto;

import com.example.NaengTulCook.entity.NeighborExperiencePost;

public class NeighborExperiencePostDTO {
//    private int id;
    private int userId;
    private String title;
    private String content;
    private int likeCount;
    private int viewCount;

    // 기본 생성자
    public NeighborExperiencePostDTO() {}

    // NeighborExperiencePost 엔티티를 받아서 DTO로 변환하는 생성자 추가
    public NeighborExperiencePostDTO(NeighborExperiencePost post) {
//        this.id = post.getId();
        this.userId = post.getUserId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.likeCount = post.getLikeCount();
        this.viewCount = post.getViewCount();
    }

    // Getter & Setter
//    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public int getLikeCount() { return likeCount; }
    public int getViewCount() { return viewCount; }

//    public void setId(int id) { this.id = id; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
    public void setLikeCount(int likeCount) { this.likeCount = likeCount; }
    public void setViewCount(int viewCount) { this.viewCount = viewCount; }
}