package org.scoula.kbspring.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data  //롬복으로 한 큐에 처리가능 getter, setter 생성자 등등 추가해줌
@AllArgsConstructor //모든 필드값을 받는 생성자를 만드는 어노테이션
public class MemberEntity {
    private Long id;
    private String email;
    private String name;
    private String grade;
    private Long asset;
}
