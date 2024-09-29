package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
RECD_DATE	VARCHAR	일자(YYYYMMDDHH24MISS)
OAUTH_ID	VARCHAR2	소셜로그인아이디
NICK_NAME	VARCHAR2	닉네임
HASH_CODE	NUMBER	해시코드
TRY_NUMB	NUMBER	시도회차 번호
TRY_PER_NUMB	NUMBER	시도회차의 개별번호
TRY_PER_SEC	NUMBER	시도회차의 개별 반응 시간
TRY_AVRG_SEC	NUMBER	시도회차의 평균 반응 시간
* */
@Entity
public class socialUserRecord {
    private String record_date;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String OAUTH_ID;
    private String nick_name;
    private String hash_code;
    private int try_number;
    private int try_per_number;
    private int try_per_sec;
    private int try_averge_sec;
}
