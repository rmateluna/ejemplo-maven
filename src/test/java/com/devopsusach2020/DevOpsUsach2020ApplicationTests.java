package com.devopsusach2020;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test
	void contextLoads() {
		String correcto = "hola";
        Assertions.assertThat(correcto).isEqualTo("hola");
	}

<<<<<<< Updated upstream
    @Test
=======
	@Test
>>>>>>> Stashed changes
	void contextLoads1() {
		String correcto = "hola";
        Assertions.assertThat(correcto).isEqualTo("hola");
	}
<<<<<<< Updated upstream

}
=======
}
>>>>>>> Stashed changes
