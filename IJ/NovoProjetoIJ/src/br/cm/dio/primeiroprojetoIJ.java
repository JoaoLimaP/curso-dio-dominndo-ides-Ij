package br.cm.dio;

import br.cm.dio.model.Gato;

public class primeiroprojetoIJ {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Object nome;
        livro livro1 = new livro( );

       /* int a = 5;
        int b = 2;

        System.out.println("hellow world " + (a+b));*/
    }
}

    class livro {
        private String nome;
        private Integer NPag;

        public livro() {
            this.nome = nome;
            this.NPag = NPag;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNPag() {
            return NPag;
        }

        public void setNPag(Integer NPag) {
            this.NPag = NPag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", NPag=" + NPag +
                    '}';
        }
    }
