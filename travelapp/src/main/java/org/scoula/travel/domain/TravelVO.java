package org.scoula.travel.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor // 지금은 퍼블릭
//(access = AccessLevel.PRIVATE) // access 레벨 private 접근제한 생성가능
public class TravelVO {
    private Long no;
    private String district;
    private String title;
    private String description;
    private String address;
    private String phone;
}