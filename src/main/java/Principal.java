
public class Principal {

    public static void main(String args[]) {
        ClasseA a = new ClasseA();
        ClasseB b = new ClasseB();
        a.setAClasseB(b); //Sua chamada é obrigatória pois a multiplicidade é 1
    }
}
