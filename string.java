import javax.sound.sampled.SourceDataLine;

public class string {
    
    public static void main(String[] args) {
        String name="Mayuresh Sanjay Kadam";
        System.out.println(name.charAt(7));
        System.out.println(name.length());
        System.out.println(name.substring(5, 21));
        System.out.println(name.contains("h"));
        System.out.println(name.concat(" anmol"));
        System.out.println(name.replace("Mayuresh","Anmol"));
        System.out.println(name.equalsIgnoreCase("mayuresh sanjay kadam"));
        for (String string : name.split("a")) {
            System.out.println(string);
        }
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());

        String cricketer="Sachin";
        cricketer.concat("Tendulkar");
        System.out.println(cricketer);

    }
   
}
