import com.qa.setup.Kitten;
import com.qa.setup.SetUp;

public class Runner {

	public static void main(String[] args) {
		
		SetUp setup = new SetUp("root", "pass");
		
//		setup.testConnection();
		
		Kitten kittenOne = new Kitten(6, "Siamese", 2, "milky");
		
		Kitten kittenUpdate = new Kitten(3, "Mainecoon", 6, "lucky");
		
		Kitten k = new Kitten(13, "Tiger", 9, "King");
		
//		setup.create(kittenUpdate);
//		setup.delete(5);
		setup.update(k, 1);
		
//		System.out.println(setup.readById(2));
		
//		System.out.println(setup.readAll());
		
		
	}
}
