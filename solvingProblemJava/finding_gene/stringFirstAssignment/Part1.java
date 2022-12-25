package stringFirstAssignment;
public class Part1 {
    public String findSimpleGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1)
            return "No Start";
        int endIndex = dna.indexOf("TAA", startIndex);
        if (endIndex == -1)
            return "No End";
        String result = dna.substring(startIndex, endIndex + 3);
        if ((result.length() % 3) == 0) {
            return result;
        }
        return "No division";
    }

    public void testSimpleGene() {
        System.out.println("hi");
        String a = "ATGGJGKFJGJGKFLFFKTAA";
        System.out.println(findSimpleGene(a));
        String ap = "ATGDKGJGKFJGJGKFLFFKTA";
        System.out.println(findSimpleGene(ap));
        String abc = "AGDKGJGKFJGJGKFLFFKTAA";
        System.out.println(findSimpleGene(abc));
        String ab = "AGDKGJGKFJGJGKFLFFKTA";
        System.out.println(findSimpleGene(ab));

    }
    
    public static void main(String[] args) {
        Part1 p = new Part1();
        p.testSimpleGene();
    
        
    }
}
