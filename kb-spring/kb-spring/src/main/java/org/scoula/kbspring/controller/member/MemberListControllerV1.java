package org.scoula.kbspring.controller.member;

import lombok.extern.slf4j.Slf4j;
import org.scoula.kbspring.domain.member.MemberEntity;
import org.scoula.kbspring.repository.member.MemberRepositoryV1;
import org.scoula.kbspring.service.member.MemberServiceV1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j

public class MemberListControllerV1 {
    private final MemberServiceV1 memberService;

    public MemberListControllerV1(MemberServiceV1 memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member/list")
   public String memberList(Model model) {
       model.addAttribute("memberList", memberService.getMemberList());

       return "member/list";
   }
}
