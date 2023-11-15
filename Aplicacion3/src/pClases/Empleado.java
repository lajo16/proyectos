
package pClases;

public class Empleado {
    private String apellidos;
    private String nombres;
    private String fechaNac;
    private String direccion;
    private int distrito;
    private String telefono;
    private int cargo;
    private String fechaCon;

    // Constructor
    public Empleado(String apellidos, String nombres, String fechaNac, String direccion,
                    int distrito, String telefono, int cargo, String fechaCon) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.distrito = distrito;
        this.telefono = telefono;
        this.cargo = cargo;
        this.fechaCon = fechaCon;
    }

    // Getters y setters para cada atributo
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getFechaCon() {
        return fechaCon;
    }

    public void setFechaCon(String fechaCon) {
        this.fechaCon = fechaCon;
    }
}