package com.fastcompus.projectboard.dto.request;

import com.fastcompus.projectboard.dto.ArticleCommentDto;
import com.fastcompus.projectboard.dto.UserAccountDto;

/**
 * A DTO for the {@link com.fastcompus.projectboard.domain.ArticleComment} entity
 */
public record ArticleCommentRequest(Long articleId, Long parentCommentId, String content) {

    public static ArticleCommentRequest of(Long articleId, String content) {
        return ArticleCommentRequest.of(articleId, null, content);
    }

    public static ArticleCommentRequest of(Long articleId, Long parentCommentId, String content) {
        return new ArticleCommentRequest(articleId, parentCommentId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
        return ArticleCommentDto.of(articleId, userAccountDto, parentCommentId, content);
    }
}
