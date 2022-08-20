package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : hello.servlet.domain.member
 * fileName       : Member
 * author         : kanghyun Kim
 * date           : 2022/08/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/19        kanghyun Kim      최초 생성
 */
@Getter
@Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member() {
    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
