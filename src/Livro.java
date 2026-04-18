public class Livro {

   private String titulo;
   private int id;
   private String autor;
   private String ano;
   private String editora;
   private String usuario;

   public Livro() {

   }

   public Livro(String titulo, int id, String autor, String ano, String editora, String usuario) {
      this.titulo = titulo;
      this.id = id;
      this.autor = autor;
      this.ano = ano;
      this.editora = editora;
      this.usuario = usuario;

   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;

   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getAutor() {
      return autor;

   }

   public void setAutor(String autor) {
      this.autor = autor;
   }
   public String ano(){
      return ano;
   }
   public void setAno(String ano){
      this.ano = ano;
   }

   public String getEditora() {
      return editora;
   }

   public void setEditora(String editora) {
      this.editora = editora;
   }

   public String getUsuario() {
      return usuario;
   }

   public void setUsuario(String usuario) {
      this.usuario = usuario;
   }

   @Override
   public String toString() {
      return "Livro [titulo=" + titulo + ", id=" + id + ", autor=" + autor + ", ano=" + ano + ", editora=" + editora
            + ", usuario=" + usuario + "]";
   }



   

}