package assngmnt2_p2;

public class ChangeMakerTest {

	public static void main(String[] args) {
		ChangeMaker2 cm2 = new ChangeMaker2(10,39);
		System.out.println(cm2.getQuarters());
		System.out.println(cm2.getDimes());
		System.out.println(cm2.getNickles());
		System.out.println(cm2.getPennies()); 
	}

}
