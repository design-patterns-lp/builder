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
                    .setArmazenamentoInternoMb(1024)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorSemModelo() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setMarca("Acer")
                    .setProcessador("i5-8256U")
                    .setArmazenamentoInternoMb(1024)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorSemProcessador() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setMarca("Acer")
                    .setModelo("Aspire 5")
                    .setArmazenamentoInternoMb(1024)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Processador inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaComputadorSemArmazenamentoInternoMb() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setMarca("Acer")
                    .setModelo("Aspire 5")
                    .setProcessador("i5-8256U")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Armazenamento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarComputadorValido() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        Computador computador = computadorBuilder
                .setMarca("Acer")
                .setModelo("Aspire 5")
                .setProcessador("i5-8256U")
                .setArmazenamentoInternoMb(1024)
                .build();

        assertNotNull(computador);

    }
}