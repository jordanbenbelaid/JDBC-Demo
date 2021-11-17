import com.qa.setup.Kitten;
import com.qa.setup.SetUp;

public class Runner {

	public static void main(String[] args) {
		
		SetUp setup = new SetUp("root", "pass");
		
//		setup.testConnection();
		
		Kitten kittenOne = new Kitten(6, "Siamese", 2, "milky");
		
//		setup.create(kittenOne);
//		setup.delete(5);
	}
}
