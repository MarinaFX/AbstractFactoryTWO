package MSystem;

public class Pizza {
    private Sabor saborDaPizza;

    public void setPizzaFlavor(Sabor pizzaFlavor){
        this.saborDaPizza = pizzaFlavor;
    }

    public void mostraSabor(){
        if (saborDaPizza.equals(Sabor.CALABRESA)){
            System.out.println("Ingredientes de hoje: ");
            System.out.println("(queijo + calabresa + tomate)");
        }
        else{
            if (saborDaPizza.equals(Sabor.PRESUNTO)){
                System.out.println("Ingredientes de hoje: ");
                System.out.println("(queijo + presunto + tomate)");
            }
            else{
                throw new IllegalArgumentException("ERR_SABOR_NÃO_CADASTRADO");
            }
        }
    }
}