enum location{
    MUMBAI("metro city","M"),
    DELHI("metro city","D"),
    BENGAL("metro city","B"),
    BANGLORE("metro city","BR"),
    ;

    String m;
    location(String s, String m) {
        System.out.println(s+" "+m);
    }

    String getM()
    {
        return m;
    }

}

public class EnumExample {

    public static void main(String[] args) {
        System.out.println(location.values());
    }
}
