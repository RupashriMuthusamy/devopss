package kce.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="pass")
	private String pass;
	
	public Login() {
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName(){
		return Name;
		}
	public void setName(String Name){
		 this.Name=Name;
	}
	public String getpass(){
		return pass;
	}
	public void setpass(String pass){
		this.pass=pass;
	}
	
}
