package assign.ch15.exam02;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {
    public static void main(String[] args) {
        Set<Member> members = new HashSet<>();
        members.add(new Member("효석", 41));
        members.add(new Member("대상혁", 30));
        members.add(new Member("효석", 41));

        System.out.println(members.size());
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
