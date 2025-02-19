//package com.example.NaengTulCook.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "neighbor_experience_post")
//public class NeighborExperiencePost {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(nullable = false)
//    private int userId;  // Foreign Key, User 테이블 참조
//
//    @Column(nullable = false)
//    private String title;
//
//    @Column(columnDefinition = "TEXT", nullable = false)
//    private String content;
//
//    @Column(nullable = false)
//    private int likeCount = 0;  // 기본값 0
//
//    @Column(nullable = false)
//    private int viewCount = 0;  // 기본값 0
//
//    // 기본 생성자
//    public NeighborExperiencePost() {}
//
//    // 생성자
//    public NeighborExperiencePost(int userId, String title, String content) {
//        this.userId = userId;
//        this.title = title;
//        this.content = content;
//    }
//
//    // Getter & Setter
//    public int getId() {
//        return id;
//    }
//
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
//
//    public int getLikeCount() {
//        return likeCount;
//    }
//
//    public void setLikeCount(int likeCount) {
//        this.likeCount = likeCount;
//    }
//
//    public int getViewCount() {
//        return viewCount;
//    }
//
//    public void setViewCount(int viewCount) {
//        this.viewCount = viewCount;
//    }
//}

package com.example.NaengTulCook.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "neighbor_experience_post")
public class NeighborExperiencePost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int userId;  // Foreign Key, User 테이블 참조

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(nullable = false)
    private int likeCount = 0;  // 기본값 0

    @Column(nullable = false)
    private int viewCount = 0;  // 기본값 0

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now(); // 생성 시간 추가

    // ✅ 기본 생성자 (JPA 사용 시 필수)
    public NeighborExperiencePost() {}

    // ✅ 필수 필드를 포함하는 생성자
    public NeighborExperiencePost(int userId, String title, String content) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }

    // ✅ 모든 필드를 포함하는 생성자
    public NeighborExperiencePost(int id, int userId, String title, String content, int likeCount, int viewCount, LocalDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.viewCount = viewCount;
        this.createdAt = createdAt;
    }

    // ✅ Getter & Setter
    public int getId() { return id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public int getLikeCount() { return likeCount; }
    public void setLikeCount(int likeCount) { this.likeCount = likeCount; }
    public int getViewCount() { return viewCount; }
    public void setViewCount(int viewCount) { this.viewCount = viewCount; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    // ✅ toString() 오버라이드 (디버깅 및 로깅에 유용)
    @Override
    public String toString() {
        return "NeighborExperiencePost{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", likeCount=" + likeCount +
                ", viewCount=" + viewCount +
                ", createdAt=" + createdAt +
                '}';
    }
}