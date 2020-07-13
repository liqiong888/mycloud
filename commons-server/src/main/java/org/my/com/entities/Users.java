package org.my.com.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.my.com.base.bean.BaseBean;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users extends BaseBean {

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Date lastLoginedAt;

    private Boolean status;

    private Byte role;

    private String email;

    private String password;

    private String globalKeyBackup;

    private Integer globalKeyId;

    private String avatar;

    private String gravatar;

    private BigDecimal balance;

    private String name;

    private String namePinyin;

    private Byte sex;

    private String phone;

    private Date birthday;

    private String location;

    private String company;

    private String slogan;

    private String website;

    private String introduction;

    private Byte job;

    private String ip;

    private Boolean phoneValidation;

    private Boolean emailValidation;

    private Integer registChannelId;

    private String phoneCountryCode;

    private String country;

    private Boolean twofaEnabled;

    private String twofaSecret;

    private Date twofaUpdatedAt;

    private Integer teamId;


}