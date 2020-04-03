package lsystems;

public class A_AA extends LRule {

	@Override
	public char getMatch() {
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] list = new char[1];
		list[0] = 'A';
		list[1] = 'A';
		return list;
	}

}
