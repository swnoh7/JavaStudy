package 상속기초;

public class Main {

	public static void main(String[] args) {
		
		// 1. Parent 자료형을 기반으로 p 객체를 생성
		//parent() 는 기본생성자 메소드.
		Parent p = new Parent();
		
		p.makeJjam();
		
		// 2. Child 자료형을 기반으로 C 객체를 생성
		
		Child c = new Child();
		
		c.makeJjam();
		// 메소드 오버라이딩을 하면 오버라이딩한 메소드를 호출해서 사용!
		c.makeJjajang();
		// 상속의 특징 3가지
		// 1. 다중상속을 지원하지 않는다.
		// 2. 상속의 횟수에 제한을 두지 않는다.
		// 3. 모든 클래스는 java.lang.object(최상위클래스)를 상속받는다.
		
		
		// 객체의 형변환 (Casting)
		// Reference Type 에서의 형변환은 반드시 상속이 전제되어있어야한다.
		// --> 객체 내의 필드, 메소드에 접근 권한 강제형변환, 자동형변환 결정한다.
		// 1)Upcasting(업캐스팅)
		// : 자식(서브, 하위)클래스가 부모(슈퍼,상위)클래스 타입으로 
		//   자동 형변환 하는것
		// 부모자료형 변수명 = new 자식자료형();
		Parent p2 = new Child();
		
		p2.makeTang();
		// 만약에 자식클래스에서 부모클래스의 메소드를 오버라이딩(재정의)한경우
		// 업캐스팅으로 만들어진 객체는 자식클래스의 메소드를 호출
		p2.makeJjam();
		
		
		
		// 2)Downcasting(다운캐스팅)
		// 부모 클래스타입이 자식 클래스로 형변환
		// Child c2 = (Child) new Parent();
		// 코드가 빨간줄이 뜬다 ---> Syntax Error!(구문오류)
		// Exception 오류
		// :구문 오류는 없으나 실행했을 때 예외 상황이 발생하는 것!
		// 다운캐스팅은 업캐스팅된 객체를 강제 형변환으로 
		// 본래의 자료형태로 되돌려 놓는것!
		// 전제 조건 : 업캐스팅된 객체만 다운캐스팅이 가능하다!
		Child c2 = (Child) p2;
		c2.makeJjam();
		c2.makeJjajang();
		c2.makeTang();
		// 본래 자신이 가지고 있던 메소드를 사용할 수 있다!!
		
		
		
		
		
	}

}
