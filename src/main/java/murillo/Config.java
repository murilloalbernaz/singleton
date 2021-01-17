package murillo;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Config {
    @ConfigProperty(name = "formatoRelatorio")
    private String formatoRelatorio = "pdf";

    @ConfigProperty(name = "tipoGrafico")
    private String tipoGrafico = "barras";

    public String getFormatoRelatorio() {
        return formatoRelatorio;
    }

    public void setFormatoRelatorio(String formatoRelatorio) {
        this.formatoRelatorio = formatoRelatorio;
    }

    public String getTipoGrafico() {
        return tipoGrafico;
    }

    public void setTipoGrafico(String tipoGrafico) {
        this.tipoGrafico = tipoGrafico;
    }
}
