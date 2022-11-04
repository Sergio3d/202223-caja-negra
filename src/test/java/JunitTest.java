import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.binarytree.*;

class JunitTest {

	
	@Test
	void testSize(){
		BinaryTree<String> arbol = new BinaryTree<String>("123abc");
		assertEquals(1,arbol.size());
	}
	
	@Test
	void testDeep() {
		BinaryTree<String> arbol = new BinaryTree<String>("123abc");
		assertEquals(0,arbol.depth());
	}
	
	@Test
	void testRoot() {
		BinaryTree<String> arbol = new BinaryTree<String>("123abc");
		assertEquals("123abc",arbol.getRoot().getContent());
	}

}
