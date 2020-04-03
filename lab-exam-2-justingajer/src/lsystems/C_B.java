package lsystems;

public class C_B extends LRule {

	@Override
	public char getMatch() {
		return 'C';
	}

	@Override
	public char[] getBody() {
		char[] list = new char[0];
		list[0] = 'B';
		return list;
	}

}
