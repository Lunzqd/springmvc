package com.lunz.course.entity.domain;

import java.io.Serializable;
import lombok.Data;

/**
  * @author al
  * @date 2019/11/29 10:49
  * @description 
  */
@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private static final long serialVersionUID = 1L;
}