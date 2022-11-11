package chapter07homework;

public class EmployeeExample {

	public static void main(String[] args) {
		
		EmpDept empDept = new EmpDept("이지나", 3000, "교육부");
		System.out.println("이름 : " + empDept.name);
		System.out.println("연봉 : " + empDept.salary);
		System.out.println("부서 : " + empDept.department);
		empDept.print();

	}

}
