package br.com.correspondente.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "audiencia", schema = "correspondente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_processo")
    private String numeroProcesso;

    @Column(name = "data")
    private LocalDateTime data;

    @Column(name = "honorarios")
    private BigDecimal honorarios;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "ativo")
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name = "advogado_id")
    private Advogado advogado;

    @ManyToOne
    @JoinColumn(name = "prioridade_id")
    private Prioridade prioridade;

    @ManyToOne
    @JoinColumn(name = "tipo_servico_id")
    private TipoServico tipoServico;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;
}
