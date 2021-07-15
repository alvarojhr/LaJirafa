package Models;

public class Cliente extends Base{

        private String cedula;
        private String direccion;
        private String email;
        private String telefono;

    public Cliente(String nombre, Estado estado, String cedula, String direccion, String email, String telefono) {
        super(nombre, estado);
        this.cedula = cedula;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }


//getter and setter

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        //

    }

