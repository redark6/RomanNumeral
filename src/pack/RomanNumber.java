package pack;

public enum RomanNumber {
	M(1000),D(500),C(100),XC(90),LXXX(80),LXX(70),LX(60),L(50),XL(40),XXX(30),XX(20),X(10),IX(9),VIII(8),VII(7),VI(6),V(5),IV(4),III(3),II(2),I(1);
	
	public final int value;
	private RomanNumber(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	

}
