package builder;

public class Computador {

    private String marca;
    private String modelo;
    private String sistemaOperacional;
    private Integer polegadasMonitor;
    private Integer resolucaoTela;
    private Integer armazenamentoInternoMb;
    private Integer memoriaRAM;
    private String marcaProcessador;
    private String processador;
    private String marcaPlacaVideo;
    private String placaVideo;
    private Integer anosGarantia;

    public Computador (){
        this.marca = "";
        this.modelo = "";
        this.processador = "";
        this.armazenamentoInternoMb = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public Integer getPolegadasMonitor() {
        return polegadasMonitor;
    }

    public void setPolegadasMonitor(Integer polegadasMonitor) {
        this.polegadasMonitor = polegadasMonitor;
    }

    public Integer getResolucaoTela() {
        return resolucaoTela;
    }

    public void setResolucaoTela(Integer resolucaoTela) {
        this.resolucaoTela = resolucaoTela;
    }

    public Integer getArmazenamentoInternoMb() {
        return armazenamentoInternoMb;
    }

    public void setArmazenamentoInternoMb(Integer armazenamentoInternoMb) {
        this.armazenamentoInternoMb = armazenamentoInternoMb;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getMarcaProcessador() {
        return marcaProcessador;
    }

    public void setMarcaProcessador(String marcaProcessador) {
        this.marcaProcessador = marcaProcessador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMarcaPlacaVideo() {
        return marcaPlacaVideo;
    }

    public void setMarcaPlacaVideo(String marcaPlacaVideo) {
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public Integer getAnosGarantia() {
        return anosGarantia;
    }

    public void setAnosGarantia(Integer anosGarantia) {
        this.anosGarantia = anosGarantia;
    }
}
