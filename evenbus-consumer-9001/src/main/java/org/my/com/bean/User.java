package org.my.com.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author Liq
 * @Date 2020-05-19 11:06
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Integer id;

    private String name;


}
