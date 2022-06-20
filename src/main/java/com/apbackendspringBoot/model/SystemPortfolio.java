
package com.apbackendspringBoot.model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Carolina Veronica Perez
 */

@Getter @Setter
@Entity
public class SystemPortfolio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private List<RedSocial> redesSociales;
    private AcercaDe acercaDe;
    private List<Educacion> educacion;
    private List<Experiencia> experiencias;
    private List<Habilidad> habilidades;
    private List<Proyecto> proyectos;
    private Usuario usuario;
    
    private static SystemPortfolio uniquePortfolio;
		
    
    private SystemPortfolio() {
	super();
        this.id = id;
	this.redesSociales = new ArrayList<RedSocial>();
	this.acercaDe = new AcercaDe();
        this.educacion = new ArrayList<Educacion>();
        this.experiencias = new ArrayList<Experiencia>();
        this.habilidades = new ArrayList<Habilidad>();
        this.proyectos = new ArrayList<Proyecto>();
        this.usuario = new Usuario();
        
        
        
    }
	
    
    public static SystemPortfolio getSystemPortfolioInstance() {
	if(uniquePortfolio==null) {
		uniquePortfolio= new SystemPortfolio();
	}
	else {
		System.out.println("Debug: Cannot create. An instance of Portfolio already exists");
	}
	return uniquePortfolio;
    }
	

}
