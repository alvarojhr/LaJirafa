package Models;

public class Usuario extends Base {

        private String password;
        private Rol rol;

    public Usuario(String nombre, Estado estado, String password, Rol rol) {
        super(nombre, estado);
        this.password = password;
        this.rol = rol;
    }

    //getter and setter

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Rol getRol() {
            return rol;
        }

        public void setRol(Rol rol) {
            this.rol = rol;
        }

        //

    }



