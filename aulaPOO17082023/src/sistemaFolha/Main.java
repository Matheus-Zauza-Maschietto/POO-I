package sistemaFolha;

public class Main {
    public static void main(String[] args){
        Funcionario func = new Funcionario("Jorginho", "6996", Cargo.DBA);
        System.out.println(func.getNome());
        System.out.println(func.getMatricula());
        System.out.println(func.getCargo().name());
        System.out.println(func.getCargo().ordinal());

        Calculadora calc = new Calculadora();
        Double salario = calc.calculaSalario(func);

        System.out.println("Resultado: "+salario);
    }
}
