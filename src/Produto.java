public class Produto {
        private String nome;
        private String descricao;
        private int quantidade;
        private double preco;
        private String codigoID;

        public Produto (String codigoID,
                                 double preco,
                                 int quantidade,
                                 String descricao,
                                 String nome)
        {
            this.codigoID = codigoID;
            this.preco = preco;
            this.quantidade = quantidade;
            this.descricao = descricao;
            this.nome = nome;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(String codigoID) {
        this.codigoID = codigoID;
    }
}

