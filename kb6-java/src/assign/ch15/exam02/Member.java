package assign.ch15.exam02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //@Data를 씀으로써 이름 자체를 비교, 동등성
@AllArgsConstructor
public class Member {
    public String name;
    public int age;
}
