// ------------------- 데이터 저장 영역 (ASRP)
// 공통메서드
// 1. void setAttribute(String name, Object value) : 그 정보를 저장하겠다. (키, 데이터)
// --> Object : 자바에서 제공하는 모든 데이터 저장 가능.
// auto boxing : int형으로 자동으로 변환. (Object value 에 11같은거 넣을 때)

// DTO : 데이터 저장, 전송에 쓰이는 객체(엔티티 객체


// 내장객체 : 객체 저장 영역


//-------------------- 자바빈즈 규약 
//1. 기본 패키지 이외의 패키지에 저장되어야 함.
//2. 멤버변수 접근지정자는 private로 선언되어야함.
//3. 기본 생성자 필요.
//4. 멤버변수들 getter, setter메서드 필요.(접근 가능) --> 얘네는 public으로 선언되어야함.

package common; // 1번, 기본 이외의 패키지

public class Person {
	private String name; // 2번. 멤버변수
	private int age; // 2번. 멤버변수
	
	public Person() {} // 기본생성자
	public Person(String name,int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
 }
