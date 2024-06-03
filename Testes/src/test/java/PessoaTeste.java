import edu.PedroDurand.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void idadeCorreta(){
        Pessoa p1 = new Pessoa("Pedro", LocalDate.of(2002, 9, 25));
        Assertions.assertEquals(21, p1.getIdade());
    }

    @Test
    void ehMaiorIdade(){
        Pessoa p1 = new Pessoa("Pedro", LocalDate.of(2002, 9, 25));
        Assertions.assertTrue(p1.getIdade() >= 18);
    }


}
