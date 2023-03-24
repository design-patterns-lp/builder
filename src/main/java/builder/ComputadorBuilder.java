package builder;

public class ComputadorBuilder {

    private Computador computador;

    public ComputadorBuilder(){
        computador = new Computador();
    }

    public Computador build(){
        if (computador.getMarca().equals("")){
            throw new IllegalArgumentException("Marca inválida");
        }
        if (computador.getModelo().equals("")){
            throw new IllegalArgumentException("Modelo inválido");
        }
        if (computador.getProcessador().equals("")){
            throw new IllegalArgumentException("Processador inválido");
        }
        if (computador.getArmazenamentoInternoMb() == 0){
            throw new IllegalArgumentException("Armazenamento inválido");
        }
        return computador;
    }
    
    public ComputadorBuilder setMarca(String marca){
        computador.setMarca(marca);
        return this;
    }

    public ComputadorBuilder setModelo(String modelo){
        computador.setModelo(modelo);
        return this;
    }

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional){
        computador.setSistemaOperacional(sistemaOperacional);
        return this;
    }

    public ComputadorBuilder setPolegadasMonitor(Integer polegadasMonitor){
        computador.setPolegadasMonitor(polegadasMonitor);
        return this;
    }

    public ComputadorBuilder setResolucaoTela(Integer resolucaoTela){
        computador.setResolucaoTela(resolucaoTela);
        return this;
    }

    public ComputadorBuilder setArmazenamentoInternoMb(Integer armazenamentoInternoMb){
        computador.setArmazenamentoInternoMb(armazenamentoInternoMb);
        return this;
    }

    public ComputadorBuilder setMemoriaRAM(Integer memoriaRAM){
        computador.setMemoriaRAM(memoriaRAM);
        return this;
    }

    public ComputadorBuilder setMarcaProcessador(String marcaProcessador){
        computador.setMarcaProcessador(marcaProcessador);
        return this;
    }

    public ComputadorBuilder setProcessador(String processador){
        computador.setProcessador(processador);
        return this;
    }

    public ComputadorBuilder setMarcaPlacaVideo(String marcaPlacaVideo){
        computador.setMarcaPlacaVideo(marcaPlacaVideo);
        return this;
    }

    public ComputadorBuilder setPlacaVideo(String placaVideo){
        computador.setPlacaVideo(placaVideo);
        return this;
    }

    public ComputadorBuilder setAnosGarantia(Integer anosGarantia){
        computador.setAnosGarantia(anosGarantia);
        return this;
    }


}
