package hello.core.member;

public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository memberRepostiory;
	
	
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
