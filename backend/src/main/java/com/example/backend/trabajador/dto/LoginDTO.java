package com.example.backend.trabajador.dto.LoginDTO;

public class LoginDTO {
	private String dni;
    private String password;

    public LoginDTO() {}

    public LoginDTO(String password, String dni){
        this.dni = dni;
        this.password = password;}

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

}
