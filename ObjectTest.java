


class Object {
	int num;
	int cnt;
	
	void cntUp() {
		cnt++;
	}
	void cntDown() {
		cnt--;
	}
	
	void print() {
		System.out.println("num: "+num+", cnt: "+cnt);
	}
}



public class ObjectTest {

	public static void main(String[] args) {
		Object obj = new Object();
		obj.num=1;
		obj.cnt=5;
		obj.cntDown();
		obj.print();

	}

}
