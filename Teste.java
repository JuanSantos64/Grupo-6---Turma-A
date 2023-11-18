
package rpgdoscara;

public class Teste {
    public static void main(String[] args) {
        int a = 3;
        testa_random(a);
    }
    
    public static void testa_random(int a){
        if (Haftafell.healthPotion != a){
            System.out.println("Tem erro aqui");
        }
        else{
            System.out.println("Ok, passou no teste ;-) ");
        }
        if (Haftafell.healthPotionEnemy != a){
            System.out.println("Tem erro aqui");
        }
        else{
            System.out.println("Ok, passou no teste ;-) ");
        }
        
    }
}
