package models;

import java.time.LocalDateTime;
import java.util.Optional;

public class Visita {
    private Visitante visitante;
    private Stand stand;
    private LocalDateTime fechaHora;
    private Optional<String> comentario;

    public Visita(Visitante visitante, Stand stand, String comentario) {
        this.visitante = visitante;
        this.stand = stand;
        this.fechaHora = LocalDateTime.now();
        this.comentario = Optional.ofNullable(comentario);
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public Stand getStand() {
        return stand;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Optional<String> getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = Optional.ofNullable(comentario);
    }

    @Override
    public String toString() {
        return "Visita{" +
                "visitante=" + visitante.getNombre() +
                ", stand=" + stand.getNumero() +
                ", fechaHora=" + fechaHora +
                ", comentario=" + comentario.orElse("Sin comentario") +
                '}';
    }
}
