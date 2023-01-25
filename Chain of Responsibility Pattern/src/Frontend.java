public class Frontend implements HelpInterface{
    private HelpInterface successor;

    final private int HELP_CONSTANT = 1;

    public Frontend(HelpInterface successor){
        this.successor = successor;
    }

    /** If the requested helpConstant is equal to the classes' HELP_CONSTANT, this class will handle the notification, else
        * the notification is passed on to the next successor in the chain.
      */
    public void getHelp(int helpConstant) {
        if(helpConstant != HELP_CONSTANT){
            successor.getHelp(helpConstant);
        }
        else {
            System.out.println("Getting help from the frontend");
        }
    }
}
