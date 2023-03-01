package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository memberRepostiory;
	
	@Autowired
	public MemberServiceImpl(MemberRepository memberRepostiory) {
		super();
		this.memberRepostiory = memberRepostiory;
	}

	@Override
	public void join(Member member) {
		memberRepostiory.save(member);
		
	}

	@Override
	public Member findMember(Long memberId) {
		
		return memberRepostiory.findById(memberId);
	}
	
	//테스트 용도
	public MemberRepository getMemberRepository() {
		return memberRepostiory;
	}

}
