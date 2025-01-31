package PasswordProj;

public class RandomCasing extends PasswordDecorator{
    
    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        StringBuilder sb = new StringBuilder();
        for (char c : passwordBeginning.getPassword().toCharArray()) {
            if (Math.random() > 0.5) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }



}
