package main;

public class Hedgehog {
    public String name ;
    public int age;
    
    public Hedgehog(){
        this.name = "Pikseli";
        this.age = 5;

    }
    
    public Hedgehog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void Speak(String speak){
        String ageString = Integer.toString(age);
        if (speak.length() > 0) System.out.println(name+": " + speak);
        
        else {
            System.out.println("Olen " + name + " ja ikäni on " + ageString + " vuotta, mutta antaisitko silti syötteen?");
        }
    }
    public void run(int montaKertaa){
        for (int i = 0; i< montaKertaa ;i++){
            System.out.println(this.name + " juoksee kovaa vauhtia!");
        }
    }
}
