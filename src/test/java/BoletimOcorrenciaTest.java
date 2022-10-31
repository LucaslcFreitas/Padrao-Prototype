import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BoletimOcorrenciaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        BoletimOcorrencia boletim = new BoletimOcorrencia(new Delegacia("5ªDep", "Policia militar", "8888-8888"), new Date(), "Carlos", 157, "Roubo de celular");

        BoletimOcorrencia boletimClone = boletim.clone();
        boletimClone.setNomeReclamante("Joaquim");
        boletimClone.setCodInfracao(147);
        boletimClone.setDescricao("Ameaça");

        assertEquals("BoletimOcorrencia{delegacia=Delegacia{unidade='5ªDep', departamento='Policia militar', telefone='8888-8888'}, nomeReclamante='Carlos', codInfracao=157, descricao='Roubo de celular'}", boletim.toString());
        assertEquals("BoletimOcorrencia{delegacia=Delegacia{unidade='5ªDep', departamento='Policia militar', telefone='8888-8888'}, nomeReclamante='Joaquim', codInfracao=147, descricao='Ameaça'}", boletimClone.toString());
    }

}