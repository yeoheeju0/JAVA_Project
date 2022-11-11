package chapter07homework;

public class EmpDept extends Employee {

	public String department;
	
	public EmpDept(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public String getInfotmation() {
		return department; //부서지정
	}

	@Override
	public void getInformation() {
	System.out.println("이름 : " +  name);
	System.out.println("연봉 : " +  salary);
	System.out.println("부서 : " +  department);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
}
