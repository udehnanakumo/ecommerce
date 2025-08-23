package com.commerce.mapper;

import com.commerce.dto.CommentDTO;
import com.commerce.dto.ProductDTO;
import com.commerce.model.Comment;
import com.commerce.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CommentMapper {
    @Mapping(target = "userId",  source = "user.id")
    CommentDTO toDTO(Comment comment);

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "product.id", ignore = true)
    Comment toEntity(CommentDTO commentDTO);


}
