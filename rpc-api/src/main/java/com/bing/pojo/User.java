package com.bing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Jean.K
 * @TIME 2022/8/17 15:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private int age;
    private String name;
}
