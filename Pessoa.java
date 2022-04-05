public class Pessoa implements Ipessoa{
String nome[] = new String[5];
    @Override
    public String getAdicionar() {
        
        nome[0]="Éric";
        nome[1] = "Gabriela";
        nome[2] = "Ruan";
        nome[3] = "Andrey";
        nome[4] = "Felipe";

        // TODO Auto-generated method stub
        return "O aluno adicionado foi: " + nome[2];
    }

    @Override
    public String getExcluir() {
        // TODO Auto-generated method stub
        return nome[2]="Excluído";
    }

    @Override
    public String getPesquisar() {
        // TODO Auto-generated method stub
        return "O nome pesquisado foi: " + nome[1];
    }
    
}