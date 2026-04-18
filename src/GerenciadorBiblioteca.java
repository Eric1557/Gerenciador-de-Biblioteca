import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorBiblioteca {

    private List<Livro> livros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public GerenciadorBiblioteca() {
    }

    public GerenciadorBiblioteca(List<Livro> livros) {
        this.livros = livros;
    }

    public String AdcionarLivro(String titulo, int id, String autor, String ano, String editora, String usuario) {
        Livro livro = new Livro(titulo, id, autor, ano, editora, usuario);
        if (titulo.isEmpty() || autor.isEmpty() || ano.isEmpty() || editora.isEmpty() || usuario.isEmpty()) {
            return "Erro: Todos os campos devem ser preenchidos.";
        }
        livros.add(livro);
        return "Livro adicionado com sucesso!";

    }

    public String RemoverLivro(int id) {
        for (int i = 0; i < livros.size(); i++) {
            if (id == livros.get(i).getId()) {
                return "livro removido com sucesso !";
            }
        }
        return "Erro: Livro não encontrado!";
    }

    public List<Livro> ListarLivros() {
        if (livros.isEmpty()) {
            System.out.println("nenhum livro Cadastrado !");
        } else {
            for (Livro livro : livros) {
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("ID: " + livro.getId());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano: " + livro.ano());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Usuario: " + livro.getUsuario());
                System.out.println("---------------------------");
            }
        }
        return livros;
    }
    
    public String EmprestimoLivro(int id,String usuario){
        for(int i = 0;i < livros.size();i++){
        if(id == livros.get(i).getId()){
            if(usuario == livros.get(i).getUsuario()){
                return "Erro: Livro já emprestado para esse usuário!";
                
            }
            else{
                livros.get(i).setUsuario(usuario);
                return "Livro emprestado com sucesso !";
            }
        }
    }
       return "Erro: Livro não encontrado!"; 
}
    
    public String DevolucaoLivro(int id){
        for(int i = 0;i < livros.size();i++){
            if(id == livros.get(i).getId()){
                if(livros.get(i).getUsuario().isEmpty()){
                    return "O livro foi emprestado !";
                }
                else{
                    livros.get(i).setUsuario("");
                }    return "Livro devolvido com sucesso!";
            }
        }
       return "Erro: Livro não encontrado!";
    }  
    
    





    
}               
            

              
 



    


    















    








