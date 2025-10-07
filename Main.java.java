
public class Main { 
public static void main(String[] args){ 
Character character = new Character("𝕮𝖍𝖆𝖗𝖆𝖈𝖙𝖊𝖗");
 
character.walk(); 
character.walk(); 
character.walk(); 
character.run(); 
character.run(); 
character.showStats(); 
System.out.println("────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────");
 
Shaman shaman = new Shaman("𝕾𝖍𝖆𝖒𝖆𝖓"); shaman.walk(); 
shaman.walk(); 
shaman.walk(); 
shaman.run(); 
shaman.run(); 
shaman.heal(); 
shaman.showStats(); 
System.out.println("────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────");

Swordsman swordsman = new Swordsman("𝕾𝖜𝖔𝖗𝖉𝖘𝖒𝖆𝖓"); 
swordsman.walk(); 
swordsman.walk(); 
swordsman.walk(); 
swordsman.run(); 
swordsman.run(); 
swordsman.slash(); 
swordsman.showStats(); 
System.out.println("────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────"); 
} 
}