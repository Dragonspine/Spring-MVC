package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName    : hello.servlet.domain.member
 * fileName       : MemberRepository
 * author         : kanghyun Kim
 * date           : 2022/08/19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/19        kanghyun Kim      최초 생성
 */
public class MemberRepository {

    /**
     * 동시성 문제 때문에 실무에선 ConcurrentHashMap, AtomicLong 사용 고려
     */
    // static으로 생성해서 new MemberRepository() 해도 store, sequence 는 하나만 사용됨
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    // singleton으로 만들것 생성자 private로 막기, instance 조회는 getInstance로만 가능
    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() {
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id ){
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
