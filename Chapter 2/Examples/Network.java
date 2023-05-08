import java.util.ArrayList;

public class Network {
	public class Member {
		private String name;
		private ArrayList<Member> friends;

		public Member (String name) {
			this.name = name;
			friends = new ArrayList<>();
		}

		public void deactivate() {
			members.remove(this);
		}

		public boolean belongsTo(Network n) {
			return Network.this == n;
		}
	}

	private ArrayList<Member> members = new ArrayList<>();

	public Member enroll(String name) {
		Member newMember = new Member(name);
		members.add(newMember);
		return newMember;
	}

	public void unenroll(Member m) {
		members.remove(m);
	}

	public static void main(String[] args) {
		Network myFace = new Network();
		Network.Member fred = myFace.enroll("Fred");
		fred.deactivate();
	}
}
