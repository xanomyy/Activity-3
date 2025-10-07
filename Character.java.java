
public class Character { 
public String name; 
public int health; 
public int stamina; 
public int manna; 
public Character(String name){
this.name = name; 
this.health = 100; 
this.stamina = 100; 
this.manna = 100; 
} 
public void walk() { 
stamina -= 1; 
} 
public void run() { 
stamina -= 3; 
} 
public void showStats() { 
    System.out.println("𝕹𝖆𝖒𝖊:" + name); 
    System.out.println("𝕳𝖊𝖆𝖑𝖙𝖍:" + health); 
    System.out.println("𝕾𝖙𝖆𝖒𝖎𝖓𝖆:" + stamina); 
    System.out.println("𝕸𝖆𝖓𝖓𝖆:" + manna); 
} 
}