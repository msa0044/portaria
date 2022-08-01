package com.wapmetal.portaria.Models.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "entradas_mensais")
public class EntradasMensaisEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7430482412985070174L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Calendar data;

    @OneToMany(mappedBy = "entradaMensal")
    private List<EntradaEntity> entradas = new ArrayList<EntradaEntity>();

    public EntradasMensaisEntity(Calendar data, List<EntradaEntity> entradas) {
        this.data = data;
        this.entradas = entradas;
    }

    public EntradasMensaisEntity() {
    }
}
