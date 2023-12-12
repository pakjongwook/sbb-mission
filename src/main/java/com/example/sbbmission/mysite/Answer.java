package com.example.sbbmission.mysite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String content;

    private LocalDateTime createDate;

//    @ManyToOne // FK
//    // 부모 자식 관계 == 부모 : Question 자식 : Answer
//    private Question question;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
