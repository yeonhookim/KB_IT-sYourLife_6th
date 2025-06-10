package org.scoula.kbspring.service.member;

import org.scoula.kbspring.domain.member.MemberEntity;
import org.scoula.kbspring.dto.member.MemberDto;
import org.scoula.kbspring.repository.member.MemberRepositoryV1;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceV1 {
    private final MemberRepositoryV1 memberRepository;

    public MemberServiceV1(MemberRepositoryV1 memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<MemberDto> getMemberList() {
        List<MemberEntity> entityList = memberRepository.getMemberList();
        List<MemberDto> dtoList = new ArrayList<>();

        for (MemberEntity entity : entityList) {
        MemberDto dto = new MemberDto();
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dtoList.add(dto);
        }

        return dtoList;
    }
}
