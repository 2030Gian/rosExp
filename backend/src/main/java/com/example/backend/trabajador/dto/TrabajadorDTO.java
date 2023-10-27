public class TrabajadorDTO {
    
        public String getPassword(){
            return this.password;
        }
        public void setPassword(String password){
            this.password = password;
        }

        public Long getId(){
            return id;
        }

        public String getDni() {
            return dni;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public String getNombrePila() {
            return nombrePila;
        }

        public String getImagen() {
            return imagen;
        }

        public String getGenero() {
            return genero;
        }

        public Date getFechaNacimiento() {
            return fechaNacimiento;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setId(Long id){
            this.id  = id;
        }
        public void setDni(String dni) {
            this.dni = dni;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }

        public void setNombrePila(String nombrePila) {
            this.nombrePila = nombrePila;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void setFechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

}
