package lsystems;

public class A_A extends LRule {

	@Override
	public char getMatch() {

		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] list = new char[0];
		list[0] = 'A';
		return list;
	}

}
