package entities;

public class Product { //clase

    public String name;//atributos
    public double price;

    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) { // metodo
        this.quantity += quantity; //this.quantity para referir-se ao atributo da classe e não ao parametro do método
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price) // casas decimais
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
