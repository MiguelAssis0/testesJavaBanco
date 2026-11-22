package EstruturaDeDados.PrincipaisImplementacoes.Stack;

import java.util.Objects;

public class Carro {
    String marca;

    public Carro(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Carro that = (Carro) object;
        return Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}