package virtual_pets_amok;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OrganicCatTest {
	@Test
	public void shouldCreateARobotCat() {
		OrganicCat underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		assertNotNull(underTest);
	}
}
