public class DNA {
    public static void main(String[] args){
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ / 
        //   / \   \   / \   \  
        //  ~   `-~ `-`   `-~ `-

        //Write a DNA.java program that determines whether there is a protein in a strand of DNA. If there is a protein it will print out the protein.

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;

        int length = dna.length();
        System.out.println("Length: " + length);

        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);
        int end = dna.indexOf("TGA");
        System.out.println("End: " + end);

        if(start != -1 && end != -1 && (end - start)%3 == 0){
            String protein;
            protein = dna.substring(start, end + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No Protein");
        }
    }
}
