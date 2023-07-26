package Listadecliente;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro {
    public static  void main(String[] org){
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList();
        Usuario user1 = new Usuario(0,"Weden","3","2","27");
        Usuario user2 = new Usuario(0,"Paulo","1","T","2");
        Usuario user3 = new Usuario(0,"Henrique","2","4","41");
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        boolean rodando = true;

        while (rodando){

            System.out.println("***==========CADATRO DO CONDOMINIO==========***");
            System.out.println("[1] Fazer cadastro");
            System.out.println("[2] Alter cadastro");
            System.out.println("[3] Lista de Morador");
            System.out.println("[4] Procurar Morador por nome");
            System.out.println("[5] Excluir Morador");
            System.out.println("[6] SAIR");
            System.out.println("Digitar a opçao");
            String opcao = Scanner.nextLine();

            switch (opcao){
                case "1":
                    salvarControllerdado();
                {
                    System.out.println("***======CADASTRO MORADOR======***");

                    //System.out.println("Digite o ID");
                    //int id = Scanner.nextInt();
                    System.out.println("Digite o Nome");
                    String nome = Scanner.nextLine();
                    System.out.println("Digite o Bloco");
                    String bloco = Scanner.nextLine();
                    System.out.println("Digite o Piso");
                    String piso = Scanner.nextLine();
                    System.out.println("Digite o Apartamento");
                    String aparatmento = Scanner.nextLine();

                    Usuario usuario = new Usuario();
                    //usuario.setId(id);
                    usuario.setNome(nome);
                    usuario.setBloco(bloco);
                    usuario.setPiso(piso);
                    usuario.setApartamento(aparatmento);


                    usuarios.add(usuario);
                    System.out.println("Cadastro efetuado com sucesso");
                    break;

                }
                case "2":{
                    System.out.println("***======ALTERAR CADASTRO======***");

                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario utemp = usuarios.get(i);

                        System.out.println("[" + i + "]" + utemp.getNome());
                    }
                    System.out.print("Digite o numero da referencia: ");
                    int referencia = Scanner.nextInt();
                    Scanner.nextLine();

                    System.out.println("Digite o Nome");
                    String nome = Scanner.nextLine();
                    System.out.println("Digite o Bloco");
                    String bloco = Scanner.nextLine();
                    System.out.println("Digite o Piso");
                    String piso = Scanner.nextLine();
                    System.out.println("Digite o Apartamento");
                    String aparatmento = Scanner.nextLine();

                    Usuario u = usuarios.get(referencia);
                    u.setNome(nome);
                    u.setBloco(bloco);
                    u.setPiso(piso);
                    u.setApartamento(aparatmento);



                    break;
                }
                case "3":{
                    System.out.println("======LISTAR MORADORES CADASTRADO======");
                    for (int i = 0; i < usuarios.size(); i ++){

                        Usuario uTemo = usuarios.get(i);
                        System.out.println("Usuario" + i);
                        System.out.println("\tID: " + usuarios.get(i).getId());
                        System.out.println("\tNome: " + usuarios.get(i).getNome());
                        System.out.println("\tBloco: " + usuarios.get(i).getBloco());
                        System.out.println("\tPiso: " + usuarios.get(i).getPiso());
                        System.out.println("\tApartamento: " + usuarios.get(i).getApartamento());

                    }
                    break;

                }
                case "4":{
                    System.out.println("==========PROCURAR MORADOR POR NOME==========");
                    System.out.print("Digite o Nome");
                    String nome = Scanner.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < usuarios.size(); i ++){

                        Usuario uTemo = usuarios.get(i);

                        if(nome.equals(uTemo.getNome())){
                            System.out.print("Morador encontrado");
                            System.out.println("\tNome: " + uTemo.getNome());
                            System.out.println("\tBloco: " + uTemo.getBloco());
                            System.out.println("\tPiso: " + uTemo.getPiso());
                            System.out.println("\tApartamento: " + uTemo.getApartamento());
                            encontrado = true;
                            break;
                        }

                        }
                    if(!encontrado){
                        System.out.println("Morador nao localizado");
                    }

                    break;
                }
                case "5":{
                    System.out.println("***=====Excluir Morador=====***");
                    for (int i = 0; i < usuarios.size(); i++) {

                        Usuario utemp = usuarios.get(i);

                        System.out.println("[" + i + "]" + utemp.getNome());

                        System.out.print("Digite o numero da referencia: ");
                        int referencia = Scanner.nextInt();
                        Scanner.nextLine();


                        usuarios.remove(referencia);
                    }

                    break;
                }
                case "6":{
                    rodando = false;

                    break;
                }
                default:{
                    break;
                }

            }
        }
        System.out.println("Fim do programa");
    }

    private static void salvarControllerdado() {
    }
}
