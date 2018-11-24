
public class teste
{
    public static void main(String[] args){
        
        Doce factory = obterFactory(args[0]);
        
        Bolo bolo = factory.criarBolo(); 
        bolo.add();
        
        CupCake cupcake = factory.criarCupCake();
        cupcake.add();
        
    }   
    
    public static Doce obterFactory(String s){
        if(s.equals("s")){
            return new Cobertura();
        } else {
            return new Chantilly();
        }
    }
    
}
