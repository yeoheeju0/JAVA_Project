package chapter07homework2;

public class ObesityInfo extends StandardWeightInfo {

	public double Obesity;
	
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public void getInformation() {
		System.out.println("이름 : " + name + "키 : " + height + "몸무게 : " + weight + "비만도 : " + getObesity() );
	} else {
		System.out.println(name + "님의" + "신장 : " + height + "몸무게 : " + weight + ", " + "비만");
	}
	
	 public double getObesity() {
		 Obesity = (weight - getStandardWeight())/ getStandardWeight() * 100 ;
		 return Obesity;
	 }

	
}
