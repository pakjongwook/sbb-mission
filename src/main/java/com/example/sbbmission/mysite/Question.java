package com.example.sbbmission.mysite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity // 데이터 베이스 연결
public class Question {
    @Id // (== PK )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /* 1씩 자동 증가하여 저장
    strategy = GenerationType.IDENTITY
    해당 컬럼만의 독립적인 시퀀스를 생성를 생성하여 번호를 증가시킬 때 사용
     */
    private Integer id;

    /* Column
    *  테이블의 컬럼명
    * */
    @Column(length = 200) // length 컬럼의 길이
    private String subject;

    @Column(columnDefinition = "TEXT") // 글자 수를 제한할 수 없는 경우에 사용
    private String content;

    private LocalDateTime createDate;


}
