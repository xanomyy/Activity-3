
public class Swordsman extends Character { 
public Swordsman(String name) { 
super(name); 
this.health = 170; 
} public void slash() {
 manna -= 10; 
} @Override public void showStats() { 
    System.out.println("𝐈 𝐚𝐦 𝐭𝐡𝐞 𝐆𝐎𝐀𝐓!"); 
    super.showStats(); 
} 
}
