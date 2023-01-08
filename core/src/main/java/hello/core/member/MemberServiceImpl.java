package hello.core.member;

public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository memberRepostiory = new MemoryMemberRepository();
	
	@Override
	public void join(Member member) {
		memberRepostiory.save(member);
		
	}

	@Override
	public Member findMember(Long memberId) {
		
		return memberRepostiory.findById(memberId);
	}

}
