import java.util.Random;


public class GeneratePassword {

    private long password;
    public GeneratePassword(){
        Random rand = new Random();
        this.password = (long)((Math.random() * (9999999999L - 10000)) +10000);
    }

    public long getPassword() {
        return password;
    }
}
