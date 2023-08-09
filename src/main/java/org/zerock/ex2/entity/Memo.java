package org.zerock.ex2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_memo")
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI
    private Long mno;
    @Column(length = 200, nullable = false)
    private String memoText;
}
