package dominio;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "organizador")
public class Organizador implements Serializable {

	private static final long serialVersionUID = 1L; // Mapping JPA

	@Id
	@Column(name = "Nombre", nullable = false)
	private String nombre;

	@Column(name = "Password", nullable = false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name="Roles")
	private Roles roles;
	
	

	public Organizador() {}

	public Organizador(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;		
	}


	public Organizador(Organizador org) {
		this.nombre = org.getNombre();
		this.password = org.getPassword();		
	}	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

		
}