package com.commerce.mapper;

import com.commerce.dto.CommentDTO;
import com.commerce.dto.ProductDTO;
import com.commerce.model.Comment;
import com.commerce.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.lang.annotation.Target;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "image", source = "image")
    ProductDTO toDTO(Product product);

    @Mapping(target = "image", source = "image")
    Product toEntity(ProductDTO productDTO);


    CommentDTO toDTO(Comment comment);

    Comment toEntity(CommentDTO commentDTO);

}
