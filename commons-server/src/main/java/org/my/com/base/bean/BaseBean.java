package org.my.com.base.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseBean implements Serializable {

    private static final long serialVersionUID = -2290111303539496497L;

    private Integer id;
}
