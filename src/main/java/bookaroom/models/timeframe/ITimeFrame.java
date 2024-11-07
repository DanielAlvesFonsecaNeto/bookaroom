package bookaroom.models.timeframe;

import java.time.LocalTime;

public interface ITimeFrame {

    /**
     * Verifica se o intervalo de tempo é válido.
     *
     * @return true se o intervalo de tempo é válido, false caso contrário.
     */
    boolean isValid();

    /**
     * Calcula a duração do intervalo de tempo em minutos.
     *
     * @return a duração do intervalo de tempo em minutos.
     */
    long getDurationMinutes();

    /**
     * Verifica se um determinado horário está dentro do intervalo de tempo.
     *
     * @param time o horário a ser verificado.
     * @return true se o horário está dentro do intervalo de tempo, false caso contrário.
     */
    boolean isWithinInterval(LocalTime time);
}
