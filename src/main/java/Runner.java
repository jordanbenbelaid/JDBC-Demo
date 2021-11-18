import com.qa.setup.Kitten;
import com.qa.setup.SetUp;

public class Runner {

	public static void main(String[] args) {
		
		SetUp setup = new SetUp("root", "pass");
		
//		setup.testConnection();
		
		Kitten kittenOne = new Kitten(6, "Siamese", 2, "milky");
		
		Kitten kittenUpdate = new Kitten(100, "BigCat", 8, "large cat");
		
		Kitten k = new Kitten(13, "Tiger", 9, "King");
		
//		setup.createPrepared(kittenUpdate);
//		setup.delete(5);
//		setup.update(k, 1);
		
//		System.out.println(setup.readById(2));
		
//		System.out.println(setup.readAll());
		
//		System.out.println(setup.readLatest());
		
		System.out.println(setup.readByIdPrepared(10));
		
		
	}
}
