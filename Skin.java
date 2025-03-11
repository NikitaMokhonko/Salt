package testing;
// name, type, condition, floatValue, stattrak
public class Skin {

    String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isStatTrak() {
        return statTrak;
    }

    public void setStatTrak(boolean statTrak) {
        this.statTrak = statTrak;
    }

    String type;
    String condition;
    boolean statTrak;

    public Skin(String name, String type, String condition, boolean statTrak){
        this.name = name;
        this.type = type;
        this.condition = condition;
        this.statTrak = statTrak;
    }
    public String toString() {
        String yesOrNo;
        if(statTrak = true){
            yesOrNo = "Yes";}
        else{
            yesOrNo = "No";
        }
        return  "\nItem: " + name + "\nItem type: " + type +  "\nCondition: " + condition + "\nStatTrak: " + yesOrNo + "\n";
    }

}

