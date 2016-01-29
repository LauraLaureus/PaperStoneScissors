package ppt;

public abstract class Choice {
    public static final Choice ROCK = new Rock();
    public static final Choice PAPER = new Paper();
    public static final Choice SCISSORS = new Scissors();
    
    private Choice(){
        
    }
    
    
    
    private  static class Rock extends Choice {
        
        public String magic (Paper paper){
            return "Piedra pierde contra papel";
        }
        public String magic (Rock rock){
            return "Piedra empata contra piedra";
        }
        public String magic (Scissors scissors){
            return "Piedra gana contra tijera";
        }
    }
    
    private  static class Paper extends Choice {
        
        
        public String magic (Paper paper){
            return "Papel empata";
        }
        public String magic (Rock rock){
            return "Piedra pierde contra papel";
        }
        public String magic (Scissors scissors){
            return "Papel pierde contra tijera";
        }
    }
    
    private  static class Scissors extends Choice {
        
        public String magic (Paper paper){
            return "Tijera gana contra papel";
        }
        public String magic (Rock rock){
            return "Piedra gana contra tijera";
        }
        public String magic (Scissors scissors){
            return "Tijera empata";
        }
    }
}
