package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
INDX_NUMB	NUMBER	정렬순서
JOIN_DATE	TEXT	가입일자(YYYYMMDDHH24MISS)
OAUTH_ID	TEXT	소셜로그인아이디
NICK_NAME	TEXT	닉네임
HASH_CODE	NUMBER	해시코드
EXIT	    BOOLEAN	탈퇴여부
LOGN_DATE	TEXT	마지막 로그인 일자(YYYYMMDDHH24MISS)
* */
@Entity
public class socialUserInfo{
    private long index_number;
    private String joinDate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String oauth_id;
    private String nick_name;
    private long hash_code;
    private boolean exit;
    private String last_login;
}