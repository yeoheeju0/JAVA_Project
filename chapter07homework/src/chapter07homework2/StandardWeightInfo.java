package chapter07homework2;

public class StandardWeightInfo extends Human {

	public double StandardWeight;

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		}


	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + "키 : " + height + "몸무게 : " + weight + "표준체충 : " + getStandardWeight());
	}

	public double getStandardWeight() {
		StandardWeight = ((height - 100) * 0.9 );
		return StandardWeight;
	}

}
