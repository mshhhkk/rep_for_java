import java.io.PrintStream;

public class IceCream extends Food {
    private String siryp;

    public IceCream() {
        super("IceCream");
    }

    public void consume() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this);
        var10000.println(var10001 + " " + this.siryp + " съеден");
    }

    public void setParam(String param) {
        this.siryp = param;
    }
}
