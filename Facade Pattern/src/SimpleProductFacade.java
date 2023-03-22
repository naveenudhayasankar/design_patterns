public class SimpleProductFacade {

    DifficultProduct dp;

    public SimpleProductFacade(){
        dp = new DifficultProduct();
    }


    // Wrapping all method calls of DifficultProduct class into a simple setName method which will be exposed.
    public void setName(String name){
        char chars[] = name.toCharArray();

        if(chars.length > 0){
            dp.setFirstNameCharacter(chars[0]);
        }

        if(chars.length > 1){
            dp.setSecondNameCharacter(chars[1]);
        }

        if(chars.length > 2){
            dp.setThirdNameCharacter(chars[2]);
        }

        if(chars.length > 3){
            dp.setFourthNameCharacter(chars[3]);
        }

        if(chars.length > 4){
            dp.setFifthNameCharacter(chars[4]);
        }

        if(chars.length > 5){
            dp.setSixthNameCharacter(chars[5]);
        }

        if(chars.length > 6){
            dp.setSeventhNameCharacter(chars[6]);
        }
    }

    // Simple methods of DifficultProduct class need not be wrapped.
    public String getName(){
        return dp.getName();
    }

}
