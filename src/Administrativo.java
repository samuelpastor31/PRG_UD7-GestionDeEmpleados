public class Administrativo extends Empleado{

    private int despacho;
    private int numeroFax;


    public Administrativo(String nombre, String apellidos, String dni, String direccion, int telefonoContacto, int salario, int despacho, int numeroFax) {
        super(nombre, apellidos, dni, direccion, telefonoContacto, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void incrementarSalario() {
        super.incrementarSalario();
        super.salario = super.salario + (salario * 0.5);
    }
}
