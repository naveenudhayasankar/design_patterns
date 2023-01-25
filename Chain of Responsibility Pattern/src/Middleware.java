public class Middleware implements HelpInterface{
    private HelpInterface successor;
    final private int HELP_CONSTANT = 2;

    public Middleware(HelpInterface successor){
        this.successor = successor;
    }

    public void getHelp(int helpConstant) {
        if(helpConstant != HELP_CONSTANT){
            successor.getHelp(helpConstant);
        }
        else{
            System.out.println("Getting help from the middleware");
        }
    }
}
