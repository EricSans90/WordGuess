public class MagicWord {
    private String word;
    private boolean[] found;

    public MagicWord (String word){
        int i;
        this.found = new boolean[word.length()];
        this.word = word;
        for (i=0; i<word.length();i++){
            this.found[i] = false;
        }

    }

    public void printMagicWord (){
        int i;
        for (i=0;i<this.word.length();i++){
            if (this.found[i]==true){
                System.out.print(this.word.charAt(i));
            } else {
                System.out.print("_");
            }
        }
        System.out.println();

        }

    public String getWord() {
        return word;
    }
    public boolean[] getFound() {
        return found;
    }

    public int getLength(){
        return this.word.length();
    }

    public boolean[] getBoolean(){
        return this.found;
    }

    @Override
    public String toString() {
        return word;
    }
}





