package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
RANK_NUMB	NUMBER	순위 번호
RECD_DATE	VARCHAR	일자(YYYYMMDDHH24MISS)
OAUTH_ID	VARCHAR2	소셜로그인아이디
NICK_NAME	VARCHAR2	닉네임
HASH_CODE	NUMBER	해시코드
AVRG_SEC	NUMBER	평균 반응 시간
*/
@Entity
public class leaderBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rank_numb;
    private String oauth_id;
    private String nick_name;
    private long hash_code;
    private int averge_second;

}
