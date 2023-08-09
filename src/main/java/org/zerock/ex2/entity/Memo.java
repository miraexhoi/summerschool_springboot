package org.zerock.ex2.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_memo")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI
    private Long mno;
    @Column(length = 200, nullable = false)
    private String memoText;
}
