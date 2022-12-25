package stringFirstAssignment;

public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String endCodon) {
        String dnaUpper = dna.toUpperCase();
        int start = dnaUpper.indexOf(startCodon.toUpperCase());
        int end = dnaUpper.indexOf(endCodon.toUpperCase());
        if (start == -1 || end == -1) {
            return "One of the permiterres not found";
        }
        
       
        String result = dna.substring(start, end + 3);
        if ((result.length() % 3) == 0) {
            return result;
        }
        return "No division";
    }

    public void testSimpleGene() {
        System.out.println("hi");
        String a = "ATGGJGKFJGJGKFLFFKTAA";
        System.out.println(findSimpleGene(a, "atg", "TAA"));
        String ap = "ATGDKGJGKFJGJGKFLFFKTA";
        System.out.println(findSimpleGene(ap, "ATG", "TAA"));
        String abc = "AGDKGJGKFJGJGKFLFFKTAA";
        System.out.println(findSimpleGene(abc, "ATG", "TAA"));
        String ab = "AGDKGJGKFJGJGKFLFFKTA";
        System.out.println(findSimpleGene(ab, "ATG", "TAA"));

    }
    public static void main(String[] args) {
        Part1 p = new Part1();
        p.testSimpleGene();
    
        
    }
    
}
