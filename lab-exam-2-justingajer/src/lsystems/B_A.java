package lsystems;

public class B_A extends LRule {

	@Override
	public char getMatch() {
		return 'B';
	}

	@Override
	public char[] getBody() {
		char[] list = new char[0];
		list[0] = 'A';
		return list;
	}

}
