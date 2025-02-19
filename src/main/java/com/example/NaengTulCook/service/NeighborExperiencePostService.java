//package com.example.NaengTulCook.service;
//
//import com.example.NaengTulCook.dto.NeighborExperiencePostDTO;
//import com.example.NaengTulCook.entity.NeighborExperiencePost;
//import com.example.NaengTulCook.repository.NeighborExperiencePostRepository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

//@Service
//public class NeighborExperiencePostService {
//
//    private final NeighborExperiencePostRepository postRepository;
//
//    public NeighborExperiencePostService(NeighborExperiencePostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
//
//    /**
//     * 📌 게시글 생성 API
//     */
//    @Transactional
//    public NeighborExperiencePost createPost(NeighborExperiencePostDTO dto) {
//        // 🔹 새로운 게시글 생성
//        NeighborExperiencePost post = new NeighborExperiencePost(
//                dto.getUserId(), dto.getTitle(), dto.getContent()
//        );
//
//        // 🔹 게시글 저장
//        return postRepository.save(post);
//    }
//}


package com.example.NaengTulCook.service;

import com.example.NaengTulCook.dto.NeighborExperiencePostDTO;
import com.example.NaengTulCook.entity.NeighborExperiencePost;
import com.example.NaengTulCook.repository.NeighborExperiencePostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NeighborExperiencePostService {

    private final NeighborExperiencePostRepository postRepository;

    public NeighborExperiencePostService(NeighborExperiencePostRepository postRepository) {
        this.postRepository = postRepository;
    }

    /**
     * 📌 게시글 생성 API
     */
    @Transactional
    public NeighborExperiencePostDTO createPost(NeighborExperiencePostDTO dto) {
        // 🔹 새로운 게시글 생성
        NeighborExperiencePost post = new NeighborExperiencePost(
                dto.getUserId(), dto.getTitle(), dto.getContent()
        );

        // 🔹 게시글 저장
        postRepository.save(post);
        return new NeighborExperiencePostDTO(post); // 🔹 DTO 변환 후 반환
    }

    /**
     * 📌 최신순 정렬 조회 (최신 게시글이 먼저)
     */
    public List<NeighborExperiencePostDTO> getPostsSortedByLatest() {
        return postRepository.findAllByOrderByCreatedAtDesc().stream()
                .map(NeighborExperiencePostDTO::new)
                .collect(Collectors.toList());
    }

    /**
     * 📌 인기순 정렬 조회 (좋아요 많은 게시글이 먼저)
     */
    public List<NeighborExperiencePostDTO> getPostsSortedByLikes() {
        return postRepository.findAllByOrderByLikeCountDesc().stream()
                .map(NeighborExperiencePostDTO::new)
                .collect(Collectors.toList());
    }
}