package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorBuilderTest {

    @Test
    void deveRetornarExcecaoParaComputadorSemMarca() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setModelo("Aspire 5")
                    .setProcessador("i5-8256U")
                    .setArmazenamentoInternoMb(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

}