package org.scoula.kbspring.repository.member;

import org.scoula.kbspring.domain.member.MemberEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //레포지토리를 담당한다는 어노테이션
public class MemberRepositoryV1 {
    public List<MemberEntity> getMemberList() {
        List<MemberEntity> memberList = new ArrayList<>();

        memberList.add(new MemberEntity(1L, "ronaldo@example.com", "호날두", "플래티넘", 30000000L));
        memberList.add(new MemberEntity(1L, "sjk@example.com", "송중기", "골드", 10000000L));
        memberList.add(new MemberEntity(1L, "xenosign@example.com", "이효석", "아이언", 10L));

        return memberList;
    }
}
