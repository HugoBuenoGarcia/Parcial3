/**
 * Representa un empleado con nombre, cargo y salario.
 */
class Empleado {
    /**
     * Nombre del empleado.
     */
    private String nombre;

    /**
     * Cargo o puesto del empleado.
     */
    private String cargo;

    /**
     * Salario actual del empleado.
     */
    private double salario;

    /**
     * Crea un nuevo empleado con los datos proporcionados.
     *
     * @param nombre Nombre del empleado.
     * @param cargo Cargo o puesto del empleado.
     * @param salario Salario inicial del empleado.
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre Nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return Cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del empleado.
     *
     * @param cargo Nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el salario del empleado.
     *
     * @return Salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     *
     * @param salario Nuevo salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Devuelve una representación en cadena del empleado.
     *
     * @return Cadena con los datos del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}