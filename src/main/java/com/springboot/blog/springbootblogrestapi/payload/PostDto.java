package com.springboot.blog.springbootblogrestapi.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@ApiModel(description = "Post model information")
@Data
public class PostDto {

    @ApiModelProperty(value = "Blog Post Id")
    private long id;

    // title should not be null or empty
    // title should have at least 2 characters
    @ApiModelProperty(value = "Blog Post title")
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    // title should not be null or empty
    // title should have at least 2 characters
    @ApiModelProperty(value = "Blog Post Description")
    @NotEmpty
    @Size(min = 5, message = "Post Description should have at least 5 characters")
    private String description;

    @ApiModelProperty(value = "Blog Post Content")
    @NotEmpty
    private String content;

    @ApiModelProperty(value = "Blog Post Comment")
    private Set<CommentDto> comments;
}
