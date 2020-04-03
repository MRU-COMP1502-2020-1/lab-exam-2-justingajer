package lsystems;

public class A_BC extends LRule {

	@Override
	public char getMatch() {
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] list = new char[1];
		list[0] = 'B';
		list[1] = 'C';
		return list;
	}
}
