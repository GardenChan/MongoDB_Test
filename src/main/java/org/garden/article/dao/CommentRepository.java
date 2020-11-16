package org.garden.article.dao;

import org.garden.article.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author GardenChan
 * @create 2020-11-16 16:39
 */
public interface CommentRepository extends MongoRepository<Comment,String> {

    Page<Comment> findByParentid(String parentid, Pageable pageable);
}
